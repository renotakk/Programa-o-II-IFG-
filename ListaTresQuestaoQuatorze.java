package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoQuatorze {

    public static void main(String[] args) {

        /* 14. Conversão de quilômetros para milhas
Solicite uma distância em quilômetros e converta para milhas.
Fórmula: milhas = km * 0.621371.
a. Entrada: Distância em quilômetros (float).
b. Saída: Distância em milhas. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a distancia em km: ");
        float distKm = s.nextFloat();

        double milhas = distKm*0.621371;

        System.out.println("A distancia em milhas é: "+milhas);

        s.close();

    }

}

