import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ModernizacionCOBOLApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ModernizacionCOBOLApplication.class, args);
        // Inicialización y uso de los beans creados por Spring Boot
    }
}