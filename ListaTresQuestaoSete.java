package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoSete {

    public static void main(String[] args) {

        /* 7. Idade em dias
Solicite a idade do usuário em anos e converta para dias,
desconsiderando anos bissextos.
a. Entrada: Idade em anos (int).
b. Saída: Idade em dias. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite quantos anos você tem: ");
        int idadeEmAnos = s.nextInt();

        int dias = idadeEmAnos*365;

        System.out.println("A conversão da idade para dias é: "+dias);

        s.close();

    }

}
