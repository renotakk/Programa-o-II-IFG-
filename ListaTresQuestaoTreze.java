package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoTreze {

    public static void main(String[] args) {

        /* 13. Cálculo do desconto em um produto
Solicite o preço original de um produto e o percentual de desconto, e
calcule o preço final.
a. Entrada: Preço original (float) e percentual de desconto (int).
b. Saída: Preço com desconto. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor original do produto: ");
        float valorOrigin = s.nextFloat();

        System.out.print("Digite o porcentual de desconto: ");
        int desconto = s.nextInt();

        double valorDesconto = (valorOrigin*desconto)/100;
        double valorTotal = valorOrigin-valorDesconto;

        System.out.println("O valor com desconto é: "+valorTotal);

        s.close();

    }

}
