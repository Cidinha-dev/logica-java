package Logica;
import java.util.Scanner;

//Estrutura condicional (if-else)

/*
Fazer um programa para ler um número inteiro, 
e depois dizer se este número é negativo ou não
*/


public class Condicional_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um número positivo ou negativo");
		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("NÚMERO NEGATIVO");
		}else {
			System.out.println("NÚMERO POSITIVO");
		}
	
		
		
		sc.close();
	}

}
