# Gateway
Proyecto separado para API Gateway con Spring Cloud Gateway y Eureka Client.
## Requisitos
- Java 21
- Eureka Server en http://localhost:8761
## Pruebas
```powershell
.\mvnw.cmd test
```
## Ejecutar
```powershell
.\mvnw.cmd spring-boot:run
```
## Verificacion
- Gateway: http://localhost:8080
- Health: http://localhost:8080/actuator/health
- Dashboard Eureka por gateway: http://localhost:8080/eureka-web/

