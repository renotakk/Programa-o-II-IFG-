package ListaDois;

import java.util.Scanner;
public class ListaDoisQuestaoTres {

    public static void main(String[] args) {

        /* 3. Dada a equação: 𝑎 + 𝑏 * 𝑐 / 𝑑 − 𝑒, implemente em linguagem Java:
a. Declare a atribua valores às variáveis 𝑎, 𝑏, 𝑐, 𝑑 e 𝑒.
b. Calcule e escreva o resultado da equação considerando a
precedência.
c. Calcule e escreva o resultado da equação alterando a ordem de
precedência com parênteses. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor de a: "); //valor de a
        int a = s.nextInt();

        System.out.print("Digite o valor de b: "); //valor de b
        int b = s.nextInt();

        System.out.print("Digite o valor de c: "); //valor de c
        int c = s.nextInt();

        System.out.print("Digite o valor de d: "); //valor de d
        int d = s.nextInt();

        System.out.print("Digite o valor de e: "); //valor de e
        int e = s.nextInt();

        int calculo1 = a + b * c / d - e; //calculo sem parênteses

        System.out.println("O resultado da equação sem parênteses é: "+calculo1);

        int calculo2 = ((a - b) * c) / (d - e); //calculo com parênteses

        System.out.println("O resultado da equação com parênteses é: "+calculo2);

        s.close();


    }

}
