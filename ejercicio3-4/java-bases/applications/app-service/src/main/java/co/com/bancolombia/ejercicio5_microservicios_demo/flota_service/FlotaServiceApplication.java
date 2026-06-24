package co.com.bancolombia.ejercicio5_microservicios_demo.flota_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FlotaServiceApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(FlotaServiceApplication.class);
        app.setAdditionalProfiles("flota");
        app.run(args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
