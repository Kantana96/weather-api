package kz.demo.integration_module.proxy.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.RequestInterceptor;
import feign.Response;
import feign.codec.ErrorDecoder;
import jakarta.servlet.http.HttpServletRequest;
import kz.demo.integration_module.model.errors.CustomFeignException;
import kz.demo.integration_module.model.errors.ErrorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    @Value("${feign.client.key}")
    private String authKey;

    @Value("${feign.client.lang}")
    private String lang;

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.query("key", authKey);
            requestTemplate.query("lang", lang);
        };
    }

    @Bean
    public ErrorDecoder errorDecoder() {
        return new CustomErrorDecoder();
    }

    public static class CustomErrorDecoder implements ErrorDecoder {
        private final ObjectMapper objectMapper = new ObjectMapper();
        @Override
        public Exception decode(String methodKey, Response response) {
            try {
                ErrorDTO errorDTO = objectMapper.readValue(response.body().asInputStream(), ErrorDTO.class);
                return new CustomFeignException(errorDTO);
            } catch (Exception e) {
                return new Default().decode(methodKey, response);
            }
        }
    }
}
