package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoDez {

    public static void main(String[] args) {

        /* 10. Divisão com quociente e resto
Solicite dois números inteiros e mostre o quociente e o resto da divisão
do primeiro pelo segundo.
a. Entrada: Dois números inteiros.
b. Saída: Quociente e resto da divisão. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o número 1: ");
        int n1 = s.nextInt();

        System.out.print("Digite o número 2: ");
        int n2 = s.nextInt();

        int divisao = n1/n2;

    }

}
