A continuación, te proporciono los tests JUnit 5 para el código Java generado anteriormente:

**SumaApplicationTest.java**
```java
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SumaApplicationTest {

    @Test
    public void testMain() {
        SumaApplication.main(new String[]{});
    }
}
```

**SumaControllerTest.java**
```java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SumaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSuma() throws Exception {
        mockMvc.perform(get("/suma?num1=2&num2=3"))
                .andExpect(status().isOk())
                .andExpect(content().string("El resultado es 5"));
    }
}
```

**SumaServiceTest.java**
```java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SumaServiceTest {

    @Autowired
    private SumaService sumaService;

    @Test
    public void testSuma() {
        int resultado = sumaService.suma(2, 3);
        assertEquals(5, resultado);
    }
}
```

**SumaEntityTest.java**
```java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaEntityTest {

    @Test
    public void testGettersAndSetters() {
        SumaEntity sumaEntity = new SumaEntity();
        sumaEntity.setNum1(2);
        sumaEntity.setNum2(3);
        sumaEntity.setResultado(5);

        assertEquals(2, sumaEntity.getNum1());
        assertEquals(3, sumaEntity.getNum2());
        assertEquals(5, sumaEntity.getResultado());
    }
}
```

**SumaRepositoryTest.java**
```java
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SumaRepositoryTest {

    @Autowired
    private SumaRepository sumaRepository;

    @Test
    public void testSuma() {
        SumaEntity sumaEntity = sumaRepository.suma(2, 3);
        assertEquals(2, sumaEntity.getNum1());
        assertEquals(3, sumaEntity.getNum2());
        assertEquals(5, sumaEntity.getResultado());
    }
}
```

Estos tests cubren las diferentes capas de la aplicación:

*   **SumaApplicationTest**: Verifica que la aplicación se inicie correctamente.
*   **SumaControllerTest**: Verifica que el controlador devuelva el resultado correcto para una solicitud GET.
*   **SumaServiceTest**: Verifica que el servicio devuelva el resultado correcto para una suma.
*   **SumaEntityTest**: Verifica que los getters y setters de la entidad funcionen correctamente.
*   **SumaRepositoryTest**: Verifica que el repositorio devuelva la entidad correcta para una suma.

Recuerda que es importante ejecutar estos tests en un entorno de prueba adecuado, como un entorno de desarrollo o un servidor de integración continua.