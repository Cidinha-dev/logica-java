
import java.util.Scanner;
public class AcrescimoJuros {

	public static void main(String[] args) {
		// 	REATRIBUIÇÃO DE UMA VARIAVEL
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Pagamento à vista digite [1] -- Para pagamento a prazo digite [2]:  ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			juros = 10.0;
		} 
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
		
		scanner.close();
	}

}

