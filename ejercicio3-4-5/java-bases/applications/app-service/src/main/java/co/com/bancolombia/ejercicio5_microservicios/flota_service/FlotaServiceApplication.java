package co.com.bancolombia.ejercicio5_microservicios.flota_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "co.com.bancolombia.ejercicio5_microservicios.flota_service.client")
public class FlotaServiceApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(FlotaServiceApplication.class);
        app.setAdditionalProfiles("flota");
        app.run(args);
    }
}
