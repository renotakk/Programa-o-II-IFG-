package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoNove {

    public static void main(String[] args) {

        /* 9. Conversão de dólares para reais
Solicite ao usuário um valor em dólares e a taxa de câmbio atual, e
converta para reais.
a. Entrada: Valor em dólares e taxa de câmbio (float).
b. Saída: Valor equivalente em reais. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade em dólares: ");
        float dolar = s.nextFloat();

        System.out.print("Digite a taxa do câmbio: ");
        float taxa = s.nextFloat();

        double valorEmReais = dolar*taxa;

        System.out.println("O valor em real é: "+valorEmReais);

        s.close();

    }

}
