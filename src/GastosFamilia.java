import java.util.Scanner;
public class GastosFamilia {

	public static void main(String[] args) {
		// OPERADORES DE ATRIBUIÇÃO += 
		
		
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		
		
		System.out.println(" GASTOS MENSAIS: ");
		
		System.out.print("LUZ: ");
		total += sc.nextDouble();
		
		System.out.print("ÁGUA: ");
		total += sc.nextDouble();
		
		System.out.print("INTERNET: ");
		total += sc.nextDouble();
		
		System.out.print("CARTÃO DE CRÉDITO: ");
		total += sc.nextDouble();
		
		System.out.print("FACULDADE: ");
		total += sc.nextDouble();
		
		System.out.print("GASOLINA: ");
		total += sc.nextDouble();
		
		System.out.print("RAÇÃO CACHORRO E GATOS: ");
		total += sc.nextDouble();
		
		System.out.print("ALUGUEL: ");
		total += sc.nextDouble();		
		
		System.out.println("-----------------------------------");
		
		System.out.println("TOTAL DE GASTOS: "+ total);
		
		
		sc.close();
	}

}
