package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoQuatro {

    public static void main(String[] args) {

        /* 4. Classificação por nota
a. Descrição: Solicite uma nota entre 0 e 10 e exiba "Reprovado" se
menor que 5, "Recuperação" se entre 5 e 6.9, e "Aprovado" se
maior ou igual a 7.
b. Entrada: Nota (float).
c. Saída: "Reprovado", "Recuperação" ou "Aprovado". */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a nota de 0 a 10: ");
        float nota = s.nextFloat();

        if (nota<5) {
            System.out.println("Reprovado");
        }
        else if (nota>=5 && nota<=6.9) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Aprovado");
        }

        s.close();

    }

}
