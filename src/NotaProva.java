import java.util.Scanner;

public class NotaProva {
	
	static final int NOTA_MINIMA = 7;
	public static void main(String[] args) {
		// OPERADORES LÓLICOS (BOOLEAN)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("DIGITE A NOTA: ");
		double nota = sc.nextDouble();
		
		boolean notaFinal = nota >= NOTA_MINIMA;
		System.out.println("PASSOU DE ANO?: " +notaFinal);
		System.out.println("----------------------------");
		
		if(notaFinal) {
			System.out.println("PARABENS! VOCÊ PASSOU DE ANO COM: "+nota);
		}else {
			System.out.println("QUE PENA, FICOU DE RECUPERAÇÃO: "+nota+" ESTUDE MAIS ");
		}
		
		sc.close();
	}

}