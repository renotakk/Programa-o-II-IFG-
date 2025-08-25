package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoTres {

    public static void main(String[] args) {

        /* 3. Maior entre dois números
a. Descrição: Solicite dois números inteiros e informe qual é o
maior.
b. Entrada: Dois números inteiros.
c. Saída: O maior dos dois números. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        if (n1>n2) {
            System.out.printf("O maior número é %d\n", n1);
        }
        else if (n1<n2) {
            System.out.printf("O maior número é %d\n", n2);
        }

        s.close();

    }

}
