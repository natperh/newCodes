import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ModernizacionCobolApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModernizacionCobolApplication.class, args);
    }

    @Bean
    public Calculadora calculadora() {
        return new CalculadoraImplementacion();
    }
}

public interface Calculadora {
    int sumar(int num1, int num2);
}

public class CalculadoraImplementacion implements Calculadora {

    @Override
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
}