package Logica;
import java.util.Scanner;

//Estrutura repetitiva for

/*
Tabuada
*/

public class for_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		for(int i = 1; i <= 10; i ++) {
			int tabuada = i * numero;
			System.out.println(i + " x "+numero+" = "+tabuada);
		}
		

		
		sc.close();
	}

}
