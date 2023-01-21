import java.util.Scanner;


public class TrocoCliente {
	
    public static void main(String[] args) {
    	// CALCULAR O TROCO DO CLIENTE
    	
    	
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE O PREÇO DO PRODUTO? ");
        double valorProduto = sc.nextDouble();

        System.out.println("DINHEIRO ENTREGUE PELO CLIENTE? ");
        Double dinheiroRecebido = sc.nextDouble();

        double troco = dinheiroRecebido - valorProduto;
        System.out.printf("O TROCO É: %.2f%n",troco);

        sc.close();
    }
}