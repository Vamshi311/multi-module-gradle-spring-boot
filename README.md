# multi-module-gradle-spring-boot
Sample multi-module spring boot application with gradle 

This project has three modules
1. library - which has a service with single method that says hello world!!!.
2. another-library - basically empty module
3. application - that includes library and another-library modules.

Application module has class with @SpringBootApplication annotation on the same level of services and controllers.
To pull controllers, services, repositories and all beans from all modules, I followed below strategy.

Strategy:

Every module will have config class with @Configuration and @ComponentScan annotations. 
@ComponentScan will scan the beans in that particular module.
Every module will have config class at the same path.
@SpringBootApplication will point scanBasePackages to the path of the config class.

