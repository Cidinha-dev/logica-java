

// APRENDENDO ENTRADA E SAIDA DE DADOS


 // import com o atalho ALT+SHIFT+O
 import java.util.Scanner;         

 // NOME DE CLASSE COMEÇA COM LETRA MAIÚSCULA
 public class Terreno {  
 
     
     public static void main(String[] args) {
         
         // CHAMANDO O OBJETO SCANNER PARA ENTRADA DE DADOS E IMPORT
         Scanner sc=new Scanner(System.in);
 
         // COM O OBJETO SCANNER É FEITA A ENTRADA DE DADOS
         System.out.println("DIGITE A LARGURA DO TERRENO: ");
         double largura = sc.nextDouble();
 
         System.out.println("DIGITE O COMPRIMENTO DO TERRENO: ");
         double comprimento = sc.nextDouble();
 
         System.out.println("DIGITE O VALOR DO METRO QUADRADO: ");
         double metroQuadrado = sc.nextDouble();
 
         // SAIDA DE DADOS 
         double area = largura * comprimento;
         double preco = area * metroQuadrado;
 
         // IMPRIMIR O RESULTADO FORMATADO printf(%.2f%n)
         System.out.printf("AREA = %.2f%n",area);
         System.out.printf("PREÇO = %.2f%n",preco);
 
 
         // DA ERRO SE O OBJETO SCANNER NÃO FOR FECHADO
         sc.close();
     }
 }
