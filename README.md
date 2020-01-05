# Proyecto de autenticación Open
## Descripción
Proyecto demo sobre la integración de Openldap con Keycloak, consumidos por una aplicación desarrollada en springboot con thymeleaf de frontend

## Componentes 
Se tienen desplegados los siguientes componentes:
* Openldap server desplegado en Docker
* Keycloak server desplegado en Docker 
* phpldadmin desplegado en Docker 
* Postgresql para keycloak desplegado en Docker 
* Aplicacion en springboot que se autentica contra keycloak

## Detalle de carpetas 
**compose-file:** Carpeta que almacena archivo de docker-compose para levantar los contenedores
**keycloakconf:** Carpeta donde se encuetra la configuración probada de real de keycloak
**ldapconf:** Carpeta donde que almacena el archivo de configuración de Openldap

## Ejecución
1. Levantar los contenedores con  el comando: `docker-compose -f keycloak-postgres.yml up` 
2. Acceder por navegador a los puertos 8080/auth para keycloak, https://localhost:6443 para phpldapmin
3. Arrancar la apliación con el comando: `mvn clean spring-boot:run`
4. Acceder a la aplicación por el enlace http://localhost:8081


