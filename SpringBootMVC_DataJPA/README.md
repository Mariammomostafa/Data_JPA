# Spring Boot maven project
- it's spring boot mvc app that uses spring-boot-starter-data-jpa to connect to data base
- add data base properties/connection info inside .properties file
- create Student Enitity & Repository interface which extends JpaRepository & all mwthods impl will be done behind the scene
- all needed beans  will be automatically created by Spring Boot when application statrt up through @EnableAutoConfiguration
- Spring Boot automatically configures and registers the DispatcherServlet as there is spring-boot-starter-web dependency on the classpath
- add the path of pages inside .properties file
- using tomcat-jasper to convert jsp pages into servlet to enable run on tomcat embeded server

### Prerequisites
- Java 17
- Spring Boot 3.5.7
- spring-boot-starter-web 
- spring-boot-starter-data-jpa 
- tomcat-jasper 11.0.9
- mysql-connector-j
- jakarta.servlet.jsp.jstl 3.0.1
- jakarta.servlet.jsp.jstl-api  3.0.0
- IDE (Eclips)
