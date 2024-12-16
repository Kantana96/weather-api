package kz.demo.gateway.jusan_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p.path("/get")
                        .filters(f -> f.addRequestHeader("MyHeader", "MyValue")
                                .addRequestParameter("Param", "MyParam"))
                        .uri("http://httpbin.org:80"))
                .route(p->p.path("/integration/**")
                        .uri("lb://integration-module"))
                .route(p->p.path("/main/**")
                        .uri("lb://main-module"))
                .build();
    }
}
