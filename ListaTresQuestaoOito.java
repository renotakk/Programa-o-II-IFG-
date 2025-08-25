package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoOito {

    public static void main(String[] args) {

        /* 8. Calculadora de área de um retângulo
Solicite a base e a altura de um retângulo e calcule sua área.
a. Entrada: Base e altura (float).
b. Saída: Área do retângulo. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        float base = s.nextFloat();

        System.out.print("Digite o valor da altura: ");
        float altura = s.nextFloat();

        double area = base*altura;

        System.out.println("O valor da base: "+area);

        s.close();

    }

}
