package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoDoze {

    public static void main(String[] args) {

        /* 12. Calculadora de área de um triângulo
Solicite a base e a altura de um triângulo e calcule sua área.
Fórmula: A = (base * altura) / 2.
a. Entrada: Base e altura (float).
b. Saída: Área do triângulo. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor da base do triângulo: ");
        float base = s.nextFloat();

        System.out.print("Digite o valor da altura do triângulo: ");
        float altura = s.nextFloat();

        double calculo = (base*altura)/2;

        System.out.println("A área do triângulo é: "+calculo);

        s.close();

    }

}
