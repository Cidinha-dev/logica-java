package Logica;
import java.util.Scanner;

//Estrutura repetitiva for

/*
Leia um valor inteiro N. Este valor será a quantidade de 
valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo
 [10,20] e quantos estão fora do intervalo, mostrando 
essas informações conforme exemplo (use a palavra "in"
para dentro do intervalo, e "out" para fora do intervalo).
*/

public class for_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
