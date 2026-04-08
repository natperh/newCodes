import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ModernizacionCOBOLApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModernizacionCOBOLApplication.class, args);
    }

    @Bean
    public Calculadora calculadora() {
        return new CalculadoraImplementacion();
    }
}

class ModuloNegocio {

    private Calculadora calculadora;

    public ModuloNegocio(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int suma(int num1, int num2) {
        return calculadora.suma(num1, num2);
    }
}

interface Calculadora {
    int suma(int num1, int num2);
}

class CalculadoraImplementacion implements Calculadora {

    @Override
    public int suma(int num1, int num2) {
        return num1 + num2;
    }
}