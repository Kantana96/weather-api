package kz.main_module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MainModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainModuleApplication.class, args);
	}

}