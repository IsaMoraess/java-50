import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/** Troco de Compra:
Peça ao usuário para inserir o valor total da compra e o valor pago. Calcule e
mostre o troco.*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor total: ");
    double valorTotal = sc.nextDouble();
    System.out.println("Digite o valor pago: ");
    double valorPago = sc.nextDouble();
    double troco = valorPago - valorTotal;
    System.out.println("O valor do seu troco é: " + troco);
    }
}
