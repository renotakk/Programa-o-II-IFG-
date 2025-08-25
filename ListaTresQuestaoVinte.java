package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoVinte {

    public static void main(String[] args) {

        /* 20. Conversão de segundos para horas, minutos e segundos
Solicite um valor em segundos e converta para o formato
horas:minutos:segundos.
a. Entrada: Tempo em segundos (int).
b. Saída: Tempo convertido para o formato hh:mm:ss. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int segundos = s.nextInt();

        int horas = segundos/3600; //1 hora tem 3600 segundos
        int resto = segundos%3600;
        int minutos = resto/60;
        int segundosTotal = resto%60;

        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundosTotal);

        s.close();

    }

}
