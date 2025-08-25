package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoDois {

    public static void main(String[] args) {

        /* 2. Par ou ímpar
a. Descrição: Solicite ao usuário um número inteiro e informe se ele
é par ou ímpar.
b. Entrada: Um número inteiro.
c. Saída: "Par" ou "Ímpar". */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();

        if (n%2==0) { //se o restante do numero for igual a zero ele é par, caso contrario, é impar
            System.out.println("Par");
        }
        else {
            System.out.println("Ímpar");
        }

        s.close();

    }

}
