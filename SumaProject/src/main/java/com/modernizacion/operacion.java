import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ModernizacionCobolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModernizacionCobolApplication.class, args);
    }
}

@RestController
class Controlador {

    @PostMapping("/suma")
    public String suma(@RequestBody DatosSuma datos) {
        return "El resultado es " + (datos.num1 + datos.num2);
    }
}

class DatosSuma {
    int num1;
    int num2;

    public DatosSuma() {
    }

    public DatosSuma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}