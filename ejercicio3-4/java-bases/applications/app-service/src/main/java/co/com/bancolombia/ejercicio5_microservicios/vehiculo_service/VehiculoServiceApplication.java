package co.com.bancolombia.ejercicio5_microservicios.vehiculo_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VehiculoServiceApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(VehiculoServiceApplication.class);
        app.setAdditionalProfiles("vehiculo");
        app.run(args);
    }
}
