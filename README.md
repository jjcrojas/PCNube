# PCNube — Hola Mundo

Aplicación web creada con Java 17, Maven y Spring Boot 3.5.16.

## Requisitos

- JDK 17 o superior.
- Maven 3.6.3 o superior.

## Ejecutar

```bash
mvn spring-boot:run
```

Abre http://localhost:8080/ o http://localhost:8080/hola en tu navegador.
Ambas rutas responden con texto plano:

```text
Hola Mundo
```

## Probar y generar el ejecutable

```bash
mvn clean verify
java -jar target/pcnube-0.0.1-SNAPSHOT.jar
```

Las pruebas verifican que ambas rutas respondan HTTP 200 y el mensaje esperado.
El puerto predeterminado es 8080; puedes cambiarlo con la variable de entorno `PORT`
o pasando `--server.port=8081` al ejecutar el JAR.

## Descargar desde GitHub

```bash
git clone https://github.com/jjcrojas/PCNube.git
cd PCNube
mvn spring-boot:run
```

Subir el código a GitHub no publica automáticamente la aplicación como sitio web.
