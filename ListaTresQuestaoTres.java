package ListaTres;

import java.util.Scanner;
public class ListaTresQuestaoTres {

    public static void main(String[] args) {

        /* 3. Calculadora de média
Solicite ao usuário quatro notas (float) e exiba a média aritmética.
a. Entrada: Quatro notas.
b. Saída: Média das notas. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a 1a nota: ");
        float nota1 = s.nextFloat();

        System.out.print("Digite a 2a nota: ");
        float nota2 = s.nextFloat();

        System.out.print("Digite a 3a nota: ");
        float nota3 = s.nextFloat();

        System.out.print("Digite a 4a nota: ");
        float nota4 = s.nextFloat();

        double soma = (nota1+nota2+nota3+nota4)/4;

        System.out.println("A média das notas é: "+soma);

        s.close();

    }

}
