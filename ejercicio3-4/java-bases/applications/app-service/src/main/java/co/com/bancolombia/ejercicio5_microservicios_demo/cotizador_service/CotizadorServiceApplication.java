package co.com.bancolombia.ejercicio5_microservicios_demo.cotizador_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CotizadorServiceApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(CotizadorServiceApplication.class);
        app.setAdditionalProfiles("cotizador");
        app.run(args);
    }
}
