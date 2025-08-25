package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoUm {

    public static void main(String[] args) {

        /* 1. Verificação de número positivo, negativo ou zero
a. Descrição: Solicite ao usuário um número inteiro e informe se ele
é positivo, negativo ou igual a zero.
b. Entrada: Um número inteiro.
c. Saída: "Positivo", "Negativo" ou "Zero". */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();

        if (n>0) {
            System.out.println("Positivo");
        }
        else if (n<0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Zero");
        }

        s.close();

    }

}
