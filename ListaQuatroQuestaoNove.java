package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoNove {

    public static void main(String[] args) {

        /* 9. Cálculo de média com conceito
a. Descrição: Solicite três notas e calcule a média. Exiba "A"
(média ≥ 9), "B" (7 ≤ média < 9), "C" (5 ≤ média < 7), ou "D"
(média < 5).
b. Entrada: Três notas (float).
c. Saída: Conceito correspondente. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a 1a nota: ");
        float nota1 = s.nextFloat();

        System.out.print("Digite a 2a nota: ");
        float nota2 = s.nextFloat();

        System.out.print("Digite a 3a nota: ");
        float nota3 = s.nextFloat();

        float media = (nota1+nota2+nota3)/3;

        if (media>=9) {
            System.out.printf("Nota %.2f A\n", media);
        }
        else if (media>=7 && media<9) {
            System.out.printf("Nota %.2f B\n", media);
        }
        else if (media>=5 && media<7) {
            System.out.printf("Nota %.2f C\n", media);
        }
        else {
            System.out.printf("Nota %.2f D\n", media);
        }

        s.close();

    }

}
