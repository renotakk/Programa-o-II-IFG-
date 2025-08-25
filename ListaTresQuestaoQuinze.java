package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoQuinze {

    public static void main(String[] args) {

        /* 15. Calculadora de volume de um cilindro
Solicite o raio e a altura de um cilindro, e calcule seu volume.
Fórmula: V = π * r^2 * h.
a. Entrada: Raio e altura (float).
b. Saída: Volume do cilindro. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o raio do cilindro: ");
        float raio = s.nextFloat();

        System.out.print("Digite a altura do cilindro: ");
        float altura = s.nextFloat();

        double pi = Math.PI; //valor de pi
        double volume = pi*raio*raio*altura;

        System.out.println("O volume do cilindro é: "+volume);

        s.close();

    }

}
