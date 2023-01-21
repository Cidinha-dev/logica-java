import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
		// CALCULAR O IMC
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		
		System.out.print("Digite seu peso (em Kg): ");
		Double peso = sc.nextDouble();
		
		System.out.print("Digite sua altura (em metros): ");
		Double altura = sc.nextDouble();
		
		Double alturaAoQuadrado = altura * altura;
		
		Double indiceMassaCorporal = peso / alturaAoQuadrado;
		
		System.out.println("Seu IMC é: " + indiceMassaCorporal);
	
		
		sc.close();
	}

}
