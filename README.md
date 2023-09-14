# Project Structure Generator Spring

#### This README will provide a brief description of a project that uses Spring Boot and Plop.js, as well as the steps required to run it. Make sure you have Plop.js installed before you begin.

## Description

#### This project is an example of a web application developed with Spring Boot and Plop.js. Spring Boot is used to create the backend of the application, while Plop.js is used to automatically generate code, in this case, it is used to create the packages (Controller, Service, Entity and REpository) from the entered values


### Asegúrate de tener instalado lo siguiente antes de continuar:

1. **Java**: Spring Boot es un framework Java, así que necesitarás tener Java instalado en tu sistema. Puedes descargarlo desde [java.com](https://www.java.com/).

2. **Spring Boot**: Necesitarás tener Spring Boot instalado. Puedes obtenerlo desde [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot) o utilizando una herramienta de gestión de dependencias como Maven o Gradle.

   3. **Plop.js**: Plop.js es una herramienta de generación de código. Puedes instalarlo globalmente usando npm (Node Package Manager) con el siguiente comando:

   ```bash
   npm install -g plop
  
## Configuración y Ejecución 

#### Clone repository use GIT

        git clone <URL del repositorio>
        cd <nombre del proyecto>
    
#### Run Spring Boot

        ./mvnw spring-boot:run

#### Execute Plop.js in terminal
        npx plop
