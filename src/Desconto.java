import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("DIGITE O PREÇO DO PRODUTO: ");
		double precoProduto = sc.nextInt();
		
		System.out.print("DIGITE A QUANTIDADE DO PRODUTO: ");
		double quantidadeProduto = sc.nextInt();
		
		double totalProduto = precoProduto * quantidadeProduto;
		
		boolean comDescontoSemDEsconto = quantidadeProduto >= 10;
		double desconto = 0.0;
		
	
		
		if(comDescontoSemDEsconto) {
			desconto = 10.0; 
			double valorDesconto = totalProduto * desconto / 100;
			double totalDesconto = totalProduto -valorDesconto;
			
			System.out.println("VALOR TOTAL COM DESCONTO: "+totalDesconto);
		}else {
			System.out.println("VALOR TOTAL: "+totalProduto);
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
