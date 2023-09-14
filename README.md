# <u>Project Structure Generator Spring</u>

_This README will provide a brief description of a project that uses Spring Boot and Plop.js, as well as the steps required to run it. Make sure you have Plop.js installed before you begin._

## <u>Description</u>

_This project is an example of a web application developed with Spring Boot and Plop.js. Spring Boot is used to create the backend of the application, while Plop.js is used to automatically generate code, in this case, it is used to create the packages (**Controller, Service, Entity and Repository**) from the entered values_


### Make sure you have the following installed before continuing:

1. <u>**Java**</u>:_Spring Boot is a Java framework, so you will need to have Java installed on your system. You can download it from java.com_


2. <u>**Spring Boot**</u>: _You will need to have Spring Boot installed. You can get it from [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot) or using a dependency management tool like Maven or Gradle._


3. <u>**Plop.js**</u>: _Plop.js is a code generation tool. You can install it globally using npm (Node Package Manager) with the following command:_

   ```bash
   npm install -g plop
  
## <u>Configuración y Ejecución</u> 

#### Clone repository use GIT

        git clone <URL del repositorio>
        cd <nombre del proyecto>
    
#### Run Spring Boot

        ./mvnw spring-boot:run

#### Execute Plop.js in terminal
        npx plop
