package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoQuatro {

    public static void main(String[] args) {

        /* 4. Calculadora de área de um círculo
Solicite o raio de um círculo e calcule sua área.
Fórmula: A = π * r^2.
a. Entrada: Raio do círculo (float).
b. Saída: Área calculada. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o raio do circulo para obter o resultado do calculo da area: ");
        double raio = s.nextDouble();
        double pi = Math.PI; //valor de pi

        double areaCirculo = pi*(raio*raio); //calculo da area

        System.out.println("O valor da area é: "+areaCirculo);

        s.close();

    }

}
