
import java.util.Scanner;

public class IdadeParaSeAposentar {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Idade: ");
		Integer idade = sc.nextInt();
		
		System.out.println("Tempo de Contribuição: ");
		Integer contribuicao = sc.nextInt();
		
		Boolean idadeAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		Boolean tempoContribuicao = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		Boolean podeAposentar = idadeAposentar && tempoContribuicao;
		
		if(podeAposentar) {
			System.out.println("Pode se Aposentar ");
		}else {
			System.out.println("Ainda não pode se aposentar ");
		}
		
		
		
		
		sc.close();
	}

}
