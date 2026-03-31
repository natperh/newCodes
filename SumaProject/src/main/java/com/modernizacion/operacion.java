import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ModernizacionCOBOLApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModernizacionCOBOLApplication.class, args);
	}
}

@RestController
class Controlador {

	@PostMapping("/suma")
	public String suma(@RequestParam(value = "num1") Integer num1, @RequestParam(value = "num2") Integer num2) {
		return "El resultado es: " + (num1 + num2);
	}
}