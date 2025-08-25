package ListaTres;

import java.util.Scanner;
public class ListaTresQuestaoUm {

    public static void main(String[] args) {

        /* 1. Soma de dois números
Solicite ao usuário dois números inteiros e exiba a soma entre eles.
a. Entrada: Dois números inteiros.
b. Saída: Resultado da soma dos dois números. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro número da soma: ");
        int n1 = s.nextInt();

        System.out.print("Digite o segundo número da soma: ");
        int n2 = s.nextInt();

        int soma = n1 + n2;

        System.out.println("O resultado da soma é: "+soma);

        s.close();

    }

}
