
# **Outlander Series API**

Este proyecto es una aplicación web desarrollada en Java utilizando Spring Boot que proporciona información sobre la serie Outlander. La aplicación permite a los usuarios navegar por temporadas, capítulos y personajes, con una base de datos alojada en Clever Cloud.

## Tabla de Contenidos

* Tecnologías Utilizadas
* Configuración del Proyecto
  * Conexión a la Base de Datos
  * Archivo application.properties
* Estructura del Proyecto
* Características Principales
  * Páginas y Funcionalidades
  * Endpoints de la API REST
* Ejecución del Proyecto
  * Inicialización de Datos
* Pruebas en Postman
* Desarrollador
* Notas Adicionales


## Tecnologías Utilizadas
* Java 17 o superior
* Spring Boot 3.3.5
* Thymeleaf para vista HTML
* Maven para gestión de dependencias
* MySQL alojado en Clever Cloud
* IntelliJ IDEA como entorno de desarrollo





## Configuración del Proyecto
### Configuración del Proyecto

Este proyecto utiliza MySQL como base de datos, alojada en Clever Cloud. La configuración de acceso a la base de datos se realiza en el archivo application.properties. Asegúrate de obtener los valores específicos de conexión desde tu cuenta en Clever Cloud.

## Archivo application.properties

spring.application.name=outlanderApi
spring.datasource.url=jdbc:mysql://uzz3wlt1t2ywywtx:SqRxvdYPphNw71E0LboS@bhsf37ldbylm4mid3nqt-mysql.services.clever-cloud.com:3306/bhsf37ldbylm4mid3nqt
spring.datasource.username=uzz3wlt1t2ywywtx
spring.datasource.password=SqRxvdYPphNw71E0LboS
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.thymeleaf.enabled=true

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
server.port=8080



## Estructura del Proyecto

Aquí tienes un README.md mejor estructurado y organizado, con secciones claramente delimitadas para facilitar la comprensión del proyecto.

Outlander Series API
Este proyecto es una aplicación web desarrollada en Java utilizando Spring Boot que proporciona información sobre la serie Outlander. La aplicación permite a los usuarios navegar por temporadas, capítulos y personajes, con una base de datos alojada en Clever Cloud.

Tabla de Contenidos
Tecnologías Utilizadas
Configuración del Proyecto
Conexión a la Base de Datos
Archivo application.properties
Estructura del Proyecto
Características Principales
Páginas y Funcionalidades
Endpoints de la API REST
Ejecución del Proyecto
Inicialización de Datos
Pruebas en Postman
Desarrollador
Notas Adicionales
Tecnologías Utilizadas
Java 17 o superior
Spring Boot 3.3.5
Thymeleaf para vistas HTML
Maven para gestión de dependencias
MySQL alojado en Clever Cloud
IntelliJ IDEA como entorno de desarrollo
Configuración del Proyecto
Conexión a la Base de Datos
Este proyecto utiliza MySQL como base de datos, alojada en Clever Cloud. La configuración de acceso a la base de datos se realiza en el archivo application.properties. Asegúrate de obtener los valores específicos de conexión desde tu cuenta en Clever Cloud.

Archivo application.properties
Configura el archivo application.properties con los detalles de tu base de datos:

properties
Copiar código
spring.datasource.url=jdbc:mysql://<host>:<port>/<database>
spring.datasource.username=<usuario>
spring.datasource.password=<contraseña>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Reemplaza <host>, <port>, <database>, <usuario>, y <contraseña> con tus credenciales de Clever Cloud.

## Estructura del Proyecto

El proyecto sigue una estructura de paquetes organizada por capas, cada una con responsabilidades específicas:

* controller - Controladores que gestionan las solicitudes HTTP y devuelven vistas.
* model - Entidades JPA que representan las tablas de la base de datos.
* repository - Interfaces para interactuar con la base de datos mediante Spring Data JPA.
* service - Servicios que contienen la lógica de negocio.
* templates - Archivos Thymeleaf para la interfaz de usuario (vistas HTML).


## Características Principales

Páginas y Funcionalidades

1. Página Principal (/)

* Muestra el nombre de la serie, póster, clasificación, promedio de calificación y el capítulo mejor calificado.


## Endpoints de la API REST

La aplicación también ofrece endpoints de API REST para acceder a los datos en formato JSON:

* GET /api/series - Devuelve la información completa de la serie.
* GET /api/temporadas - Devuelve una lista de todas las temporadas.
* GET /api/temporada/{numero} - Devuelve los detalles de una temporada específica.
* GET /api/personajes - Devuelve una lista de los personajes principales de la serie.

## Ejecución del Proyecto

* Requisitos Previos
* Java 17 o superior
* Maven
* Base de datos MySQL activa en Clever Cloud

## Pasos para Ejecutar
1. Clona el repositorio:
~~git clone <URL-del-repositorio>

   cd <nombre-del-directorio>~~~~~~~~

2. Configura el archivo application.properties:
   Añade las credenciales de MySQL en Clever Cloud.

3. Compila y ejecuta la aplicación:
   mvn spring-boot:run

4. http://localhost:8080

## Inicialización de Datos

La aplicación incluye un CommandLineRunner para inicializar la base de datos con datos de prueba sobre temporadas, capítulos y personajes de la serie. Esto se ejecuta automáticamente al iniciar la aplicación.

## Pruebas en Postman

1. Para probar los endpoints de la API, puedes utilizar Postman:

2. Importa una colección de Postman con solicitudes configuradas para los endpoints (si tienes una).
Realiza solicitudes a los endpoints de la API para verificar el funcionamiento de cada uno.

## Desarrollador

Proyecto desarrollado por Valentina Hoyos Escobar. Este proyecto forma parte de un ejercicio de desarrollo de aplicaciones web para gestionar información de series de televisión.

## Notas Adicionales

* Conexión a la Base de Datos: Asegúrate de que la base de datos en Clever Cloud esté activa antes de ejecutar la aplicación.
* Problemas de Conexión: Si experimentas problemas de conexión, verifica los detalles en application.properties y que la base de datos esté en funcionamiento.
* Acceso a Internet: La aplicación requiere acceso a Internet para conectarse a la base de datos alojada en Clever Cloud.
