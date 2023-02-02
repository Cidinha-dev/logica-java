package Logica;
import java.util.Locale;
import java.util.Scanner;


//Estrutura Sequencial (entrada, processamento, saída)

/*Fazer um programa para ler quatro valores 
inteiros A, B, C e D. A seguir, calcule e 
mostre a diferença do produto 
de A e B pelo produto de C e D segundo a 
fórmula: DIFERENCA = (A * B - C * D).
*/

public class Sequencial_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int A, B, C, D, dif;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = A * B - C * D;
		
		System.out.println("DIFERENÇA = "+ dif);
		
		sc.close();
	}

}
