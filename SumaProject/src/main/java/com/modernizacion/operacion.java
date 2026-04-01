import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SumaApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SumaApplication.class, args);
        SumaService sumaService = context.getBean(SumaService.class);
        System.out.println(sumaService.sumar(10, 20));
    }
}

class SumarControlador {
    private SumaService sumaService;

    public SumarControlador(SumaService sumaService) {
        this.sumaService = sumaService;
    }

    public int sumar(int num1, int num2) {
        return sumaService.sumar(num1, num2);
    }
}

@FunctionalInterface
interface SumaInterface {
    int sumar(int num1, int num2);
}

class SumaService implements SumaInterface {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }
}