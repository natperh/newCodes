import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SumaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SumaApplication.class, args);
    }
}

@RestController
class SumaController {

    @GetMapping("/suma")
    public int suma(int num1, int num2) {
        return num1 + num2;
    }
}