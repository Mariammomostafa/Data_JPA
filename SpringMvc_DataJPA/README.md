# spring-Data-Jpa
- it's spring mvc maven project uses Data-JPA to connect to Data Base
- used java-based configurations to configure Dispatcher Servlet & it's configure class
- used java-based configurations to configure all neccessary beans needed for Data-JPA
- create ComboPooledDataSource bean for connection pool 
- create bean of LocalContainerEntityManagerFactoryBean to create EntityManagerFactory obj based on :
        - given Datasource , hibernate properties , package to scan Entities , JpaVendorAdaptor
- create bean of TransactionManager & use @Transactional annotation to let spring mange transactions
- create Repository interface which extends JpaRepository & there NO need to implement all CRUD operations due to Data-JPA will do this behind the scene
- create index.jsp page to :
    - Register Student
    - Fetch Student
    - Fetch All Students
  - create result.jsp & viewList.jsp pages to view the results

 ### Prerequisites
- Java 17
- spring-data-jpa 3.5.1 
- hibernate-core 7.0.6.Final
- jakarta.persistence-api 3.2.0
- mysql-connector-j 8.3.0
- c3p0 0.9.5.5
- jakarta.servlet.jsp.jstl 3.0.1
- jakarta.servlet.jsp.jstl-api  3.0.0
- IDE (Eclips)
 
