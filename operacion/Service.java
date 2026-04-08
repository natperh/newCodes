**SumaApplication.java**
```java
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumaApplication.class, args);
    }
}
```

**SumaController.java**
```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumaController {

    @GetMapping("/suma")
    public String suma(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int resultado = sumaService.suma(num1, num2);
        return "El resultado es " + resultado;
    }
}
```

**SumaService.java**
```java
import org.springframework.stereotype.Service;

@Service
public class SumaService {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }
}
```

**SumaEntity.java**
```java
public class SumaEntity {
    private int num1;
    private int num2;
    private int resultado;

    // Getters y setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
```

**SumaRepository.java**
```java
import org.springframework.stereotype.Repository;

@Repository
public class SumaRepository {

    public SumaEntity suma(int num1, int num2) {
        SumaEntity sumaEntity = new SumaEntity();
        sumaEntity.setNum1(num1);
        sumaEntity.setNum2(num2);
        sumaEntity.setResultado(num1 + num2);
        return sumaEntity;
    }
}
```

**application.properties**
```properties
server.port=8080
```

**Pom.xml** (si se utiliza Maven)
```xml
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
</dependencies>
```

**build.gradle** (si se utiliza Gradle)
```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
}
```

**Ejecución**

*   Iniciar la aplicación: `mvn spring-boot:run` (si se utiliza Maven) o `gradle bootRun` (si se utiliza Gradle)
*   Acceder a la URL: `http://localhost:8080/suma?num1=2&num2=3`
*   Ver el resultado: "El resultado es 5"