package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operations;

public class Main {

	public static void main(String[] args) {

		float num1, num2;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o primeiro valor? ");
		num1 = sc.nextFloat();
		System.out.print("Qual o segundo valor? ");
		num2 = sc.nextFloat();
		
		Operations operations = new Operations();
		System.out.println("-------------------------------");
		System.out.println("          RESULTADOS           ");
		System.out.println("-------------------------------");
		System.out.printf("Soma = %.2f %n", operations.addition(num1, num2));
		System.out.printf("Subtração = %.2f %n", operations.subtraction(num1, num2));
		System.out.printf("Multiplicação = %.2f %n", operations.multiplication(num1, num2));
		System.out.printf("Divisão = %.2f %n", operations.division(num1, num2));
		
		
		sc.close();
	}

}