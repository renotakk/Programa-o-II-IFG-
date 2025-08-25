package ListaTres;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class ListaTresQuestaoCinco {

    public static void main(String[] args) {

        /* 5. Conversão de unidades de tempo
Solicite ao usuário um valor em horas e converta para minutos e
segundos.
a. Entrada: Tempo em horas (int).
b. Saída: Tempo em minutos e segundos. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = s.nextInt();

        int minutos = horas*60;
        int segundos = minutos*610;

        System.out.printf("As horas equivalem a %d minutos ou %d segundos.%n", minutos, segundos);

        s.close();

    }

}
