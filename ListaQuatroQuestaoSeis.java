package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoSeis {

    public static void main(String[] args) {

        /* 6. Maior entre três números
a. Descrição: Solicite três números inteiros e informe qual é o
maior.
b. Entrada: Três números inteiros.
c. Saída: O maior dos três números. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = s.nextInt();

        if (n2<n1 && n1>n3) {
            System.out.println("O primeiro número é maior");
        }
        else if (n1<n2 && n2>n3) {
            System.out.println("O segundo número é maior");
        }
        else {
            System.out.println("O terceiro número é maior");
        }

        s.close();

    }

}
