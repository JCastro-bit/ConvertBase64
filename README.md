﻿# Proyecto ConvertBase64 👨‍💻

Este es un proyecto de ejemplo que muestra cómo construir una aplicación de conversión a Base64 utilizando Spring Boot.

## Descripción

La aplicación consiste en un servidor backend escrito en Java utilizando el framework Spring Boot. Proporciona un endpoint REST para convertir una cadena de texto a su representación en Base64.

## Funcionalidades

- Convierte una cadena de texto a Base64.
- Manejo de errores cuando no es posible conectar con el backend.

## Requisitos

- Java 11 o superior.
- Maven 3.2 o superior.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Abre el proyecto en tu entorno de desarrollo favorito.
3. Ejecuta el siguiente comando para compilar y ejecutar la aplicación:
    
    ```powershell
    mvn spring-boot:run
    ```
    
4. La aplicación se ejecutará en `http://localhost:8080`.

## Uso

1. Abre tu consola y ejecuta.
    
    ```powershell
    curl -X POST -H "Content-Type: application/json" -d '{"string":"yourString"}' http://localhost:8080/base64
    ```
    
2. La representación en Base64 de la cadena de texto se mostrará en el campo de salida.

## Contribución

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una rama con tu nueva funcionalidad o mejora.
3. Realiza los cambios necesarios y realiza commit.
4. Envía un pull request indicando tus cambios para su revisión.

## Author [Javier Castro](https://casttro.mx)
