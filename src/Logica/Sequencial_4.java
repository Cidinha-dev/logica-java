package Logica;
import java.util.Locale;
import java.util.Scanner;


//Estrutura Sequencial (entrada, processamento, saída)

/*Fazer um programa que leia o número de um funcionário, 
seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir,
mostre o número e o salário do funcionário, com duas 
casas decimais.
*/

public class Sequencial_4 {

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
