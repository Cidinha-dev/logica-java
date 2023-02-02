package Logica;
import java.util.Scanner;

//Estrutura condicional (if-else)

/*
Fazer um programa para ler um número inteiro e dizer 
se este número é par ou ímpar
*/


public class Condicional_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int parImpar = sc.nextInt();
		
		
		// % CHAMADO DE MODULO = AO RESTO DA DIVISÃO
		if(parImpar % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
	
		
		
		sc.close();
	}

}
