import java.util.Scanner;
public class ConcursoPublico {

	
	static final Double NOTA_CLASSIFICATORIA_FINAL = 150.0;
	static final Double NOTA_MINIMA = 60.0;
	
	public static void main(String[] args) {
		// VALIDANDO O VALOR BOOLEAN ANTES DE ENTRAR NO IF
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("NOTA DE PORTUGUES: ");
		Double notaPortugues = sc.nextDouble();
		
		
		System.out.println("NOTA DE MATEMATICA: ");
		Double notaMatematica = sc.nextDouble();
		

		Boolean minimoPortugues = notaPortugues >= NOTA_MINIMA;
		Boolean minimoMatematica = notaMatematica >= NOTA_MINIMA;
		
		
		Double notaTotal = notaPortugues + notaMatematica;
		
		Boolean pontuacaoFinal = notaTotal >= NOTA_CLASSIFICATORIA_FINAL;
		
		
		Boolean passou = minimoPortugues && minimoMatematica && pontuacaoFinal;
		
		if(passou) {
			System.out.println("VOCÊ PASSOU NO CONCURSO! ");
		}else {
			System.out.println("QUE PENA NÃO FOI DESSA VEZ, TENTE OUTRA VEZ");
		}
		
		
		sc.close();
	}

}
