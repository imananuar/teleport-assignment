**SETUP GUIDE**

Java version: 21
Build Tool: Maven

Renaming application.properties.template to application.properties.

Configure these:
> spring.application.name=teleport  
server.port=8081  
spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

- `mvn clean package -DskipTests`
- `java -jar target/teleport-0.0.1-SNAPSHOT.jar`

Apps will run on http://localhost:8081

Quick test on your local:
[GET /next-tracking/number](http://localhost:8081/next-tracking-number/redbox/?origin_country_id=MY&destination_country_id=ID&weight=2.001&created_at=2025-04-24T16:17:45.109871Z&customer_id=8db7c42c-486b-47ac-a587-ee1085ee5450&customer_name=Iman%20Anuar)

Live API Demo:
[Live API](http://api.imananuar.com/next-tracking-number/redbox/?origin_country_id=MY&destination_country_id=ID&weight=2.001&created_at=2025-04-24T16:17:45.109871Z&customer_id=8db7c42c-486b-47ac-a587-ee1085ee5450&customer_name=Iman%20Anuar)
