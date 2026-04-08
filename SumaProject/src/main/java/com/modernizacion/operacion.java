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

class ModeloDominio {
    private int num1;
    private int num2;
    private int resultado;

    public ModeloDominio(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

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

class ServicioNegocio {

    private Calculadora calculadora;

    public ServicioNegocio(Calculadora calculadora) {
        this.calculadora = calculadora;
    }

    public int operar(ModeloDominio modelo) {
        return calculadora.suma(modelo.getNum1(), modelo.getNum2());
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