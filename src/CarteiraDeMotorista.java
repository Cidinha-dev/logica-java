import java.util.Scanner;


public class CarteiraDeMotorista {
	
	// CONSTANTE INALTERAVEL STATICA 
	static final int IDADE_MINIMA_TIRAR_CARTEIRA = 18;
	public static void main(String[] args) {	
		// TIRAR CARTEIRA DE MOTORISTA
		
		
		Scanner sc = new Scanner(System.in);
	
		// CONSTANTE
		// final int idadeMinimaTirarCarteira = 18;
		
		System.out.println("DIGITE SUA IDADE: ");
		int idade = sc.nextInt();
		
		// COMPARAR SE É TRUE COM O BOOLEAN
		boolean podeTiraCarteira = idade >= IDADE_MINIMA_TIRAR_CARTEIRA;		
		System.out.println(" PODE TIRAR A CARTEIRA DE MOTORISTA? "+podeTiraCarteira);
		
		
		System.out.println("-----------------------------------------");
		
		// SE FOR TRUE ENTRA NO IF
		if(podeTiraCarteira) {
			System.out.println(" SIM, COM "+idade+" ANOS VOCÊ PODE TIRAR A CARTEIRA ");
		}else {
			System.out.println(" NÃO, COM "+idade+" ANOS VOCÊ NÃO PODE TIRAR A CARTEIRA AINDA ");
			if(idade<18) {
				int quantoFalta = 18 - idade;
				System.out.println(" DAQUI A "+quantoFalta+ " ANOS VOCÊ VAI PODER ");
			}
		}
		
	
		
		sc.close();
	}

}