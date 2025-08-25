package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoDezenove {

    public static void main(String[] args) {

        /* 19. Calculadora de equação do 2º grau
Solicite os coeficientes a, b e c de uma equação do segundo grau e
calcule suas raízes, se existirem. Utilize a fórmula de Bhaskara.
a. Entrada: Coeficientes a, b e c (float).
b. Saída: Raízes da equação ou mensagem indicando inexistência
de raízes reais. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        float a = s.nextFloat();

        System.out.print("Digite o valor de b: ");
        float b = s.nextFloat();

        System.out.print("Digite o valor de c: ");
        float c = s.nextFloat();

        double delta = (b*b)-(4*a*c);

        if (delta<0) {
            System.out.println("Não existem raízes reais");
        } else {
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);

            System.out.println("As raízes da equação são: "+x1+" e "+x2);

        }

        s.close();
    }

}
