package Logica;
import java.util.Locale;
import java.util.Scanner;


//Estrutura Sequencial (entrada, processamento, saída)

/*
Fazer um programa para ler o código de uma peça 1, 
o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário
de cada peça 2. Calcule e mostre o valor a ser pago.
*/

public class Sequencial_5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		int funcionarios,horasTrabalhadas;
		double porHora, salario;
		
		System.out.println("NÚMERO DE FUNCIONARIOS: ");
		 funcionarios = sc.nextInt();
		
		System.out.println("NÚMERO DE HORAS TRABALHADAS: ");
		 horasTrabalhadas = sc.nextInt();
		
		System.out.println("RECEBE POR HORA: ");
		porHora = sc.nextDouble();
		
		salario = horasTrabalhadas * porHora;
		
		System.out.println("NUNBER = "+funcionarios);
		System.out.printf("SALARY = R$ %.2f%n",salario);
		
		sc.close();
	}

}
