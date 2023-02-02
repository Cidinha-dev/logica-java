package Logica;
import java.util.Scanner;


//Estrutura Sequencial (entrada, processamento, saída)

/* Faça um programa para ler dois valores inteiros, 
e depois mostrar na tela a soma desses números com 
uma mensagem explicativa, conforme exemplos
*/

public class Sequencial_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Integer	y = sc.nextInt();
		Integer x = sc.nextInt();
		Integer soma = y + x;
		
		System.out.println("SOMA: "+soma);
		
		sc.close();
	
	}

}
