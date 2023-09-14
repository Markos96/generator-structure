module.exports = function (plop) {
    plop.setGenerator('spring-boot-structure', {
        description: 'Genera una estructura de Spring Boot con clases personalizadas',
        prompts: [
            {
                type: 'input',
                name: 'packageName',
                message: 'Nombre del paquete base (por ejemplo, "com.example"):',
            },
            {
                type: 'input',
                name: 'className',
                message: 'Nombre de la clase base (por ejemplo, "Pepe"):',
            },
        ],
        actions: [

            // Action to create package Config
            {
                type: 'add',
                path: 'src/main/java/{{packageName}}/config/package-info.java',
                template: '',
            },

            // Action to create package Controller
            {
                type: 'add',
                path: 'src/main/java/{{packageName}}/controller/{{className}}Controller.java',
                templateFile: 'src/main/resources/template/ControllerTemplate.java',
            },

            // Action to create package Entity
            {
                type: 'add',
                path: 'src/main/java/{{packageName}}/entity/{{className}}Entity.java',
                templateFile: 'src/main/resources/template/EntityTemplate.java',
            },

            // Action to create package DTO
            {
                type: 'add',
                path: 'src/main/java/{{packageName}}/dto/{{className}}DTO.java',
                templateFile: '',
            },

            // Action to create package Repository
            {
                type: 'add',
                path: 'src/main/java/{{packageName}}/repository/{{className}}Repository.java',
                templateFile: 'src/main/resources/template/RepositoryTemplate.java',
            },

            // Action to create package Service
            {
                type: 'add',
                path: 'src/main/java/{{packageName}}/service/{{className}}Service.java',
                templateFile: 'src/main/resources/template/ServiceTemplate.java',
            },

            // Action to create the main class
            {
                type: 'add',
                path: 'src/main/java/{{packageName}}/{{className}}Application.java',
                templateFile: 'src/main/resources/template/MainTemplate.java',
            },
        ],
    });
};
  