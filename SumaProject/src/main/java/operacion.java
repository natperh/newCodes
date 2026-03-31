//Suma.java
package com.ejemplo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Suma {

	public static int sumar(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		int resultado = SpringApplication.run(Suma.class, args).getBean(Suma.class).sumar(10, 20);
		System.out.println("El resultado es: " + resultado);
	}
}