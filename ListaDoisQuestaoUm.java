package ListaDois;

import java.util.Scanner;
public class ListaDoisQuestaoUm {

    public static void main(String[] args) {

        /* 1. Utilizando a linguagem Java, declare e inicialize variáveis para
armazenar:
a. A idade de uma pessoa.
b. O salário mensal.
c. Uma letra do alfabeto.
d. Uma frase de boas-vindas.
e. Um valor lógico indicando se um número é par */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: "); //a idade
        int idade = s.nextInt();

        System.out.println("Sua idade é: "+idade);

        System.out.print("Digite seu salário mensal: "); //o salário mensal
        float salario = s.nextFloat();

        System.out.println("Seu salário mensal é: "+salario);

        System.out.print("Digite uma letra do alfabeto: "); //letra do alfabeto
        char alfabeto = s.next().charAt(0);

        s.nextLine();

        System.out.println("A letra do alfabeto é: "+alfabeto);

        System.out.print("Digite uma frase de boas-vindas: "); //frase de boas-vindas
        String frase = s.nextLine();

        System.out.println(frase);

        System.out.print("Digite um número: "); //valor logico indicando se é par
        int numero = s.nextInt();

        boolean par = numero % 2 == 0; //true (verdadeiro) para par e false (falso) para impar

        System.out.println("O número digitado é par? "+par);

        s.close();

    }
}
