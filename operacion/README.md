**README.md**

**Aplicación de Suma con Spring Boot**

Esta aplicación es un ejemplo básico de una aplicación web que realiza una suma de dos números utilizando Spring Boot. A continuación, se describe la lógica de negocio migrada y cómo ejecutar la aplicación.

**Lógica de Negocio**

La aplicación consta de los siguientes componentes:

*   **SumaController**: Recibe las solicitudes GET a la URL `/suma` y devuelve el resultado de la suma de dos números.
*   **SumaService**: Realiza la lógica de negocio de la suma de dos números.
*   **SumaEntity**: Representa la entidad que almacena los números y el resultado de la suma.
*   **SumaRepository**: Simula un repositorio que almacena y recupera los datos de la suma.

**Flujo de Ejecución**

1.  El usuario accede a la URL `http://localhost:8080/suma?num1=2&num2=3`.
2.  El **SumaController** recibe la solicitud GET y llama al método `suma` del **SumaService**.
3.  El **SumaService** realiza la suma de los dos números y devuelve el resultado.
4.  El **SumaController** devuelve el resultado de la suma en forma de cadena.
5.  El usuario ve el resultado de la suma en la página web.

**Configuración**

La aplicación utiliza el puerto 8080 por defecto. Puedes cambiar el puerto en el archivo `application.properties`.

**Dependencias**

La aplicación utiliza la dependencia `spring-boot-starter-web` para habilitar las características de Spring Boot.

**Ejecución**

Para ejecutar la aplicación, sigue los siguientes pasos:

1.  Inicia la aplicación utilizando el comando `mvn spring-boot:run` (si se utiliza Maven) o `gradle bootRun` (si se utiliza Gradle).
2.  Accede a la URL `http://localhost:8080/suma?num1=2&num2=3` en tu navegador.
3.  Verifica que el resultado de la suma sea correcto.

**Notas**

*   Esta aplicación es un ejemplo básico y no incluye validaciones ni manejo de errores.
*   La aplicación utiliza un repositorio simulado para almacenar y recuperar los datos de la suma.
*   Puedes personalizar la aplicación para adaptarla a tus necesidades específicas.