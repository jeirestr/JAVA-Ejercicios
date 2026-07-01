package com.example.gateway;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest(properties = {
    "eureka.client.enabled=false",
    "spring.cloud.discovery.enabled=false",
    "spring.cloud.gateway.server.webflux.discovery.locator.enabled=false"
})
class GatewayApplicationTests {
    @Test
    void contextLoads() {
    }
}

