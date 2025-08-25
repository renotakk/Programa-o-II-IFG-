package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoDezesseis {

    public static void main(String[] args) {

        /* 16. Calculadora de velocidade média
Solicite a distância percorrida e o tempo gasto, e calcule a velocidade
média. Fórmula: v = d / t.
a. Entrada: Distância (float) e tempo (float).
b. Saída: Velocidade média. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a distancia percorrida: ");
        float d = s.nextFloat();

        System.out.print("Digite o tempo gasto: ");
        float t = s.nextFloat();

        double velocidadeMedia = d/t;

        System.out.println("A velocidade media é: "+velocidadeMedia);

        s.close();

    }

}
