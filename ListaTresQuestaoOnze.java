package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoOnze {

    public static void main(String[] args) {

        /* 11. Conversão de metros para centímetros
Solicite uma medida em metros e converta para centímetros.
a. Entrada: Medida em metros (float).
b. Saída: Valor em centímetros. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        float metros = s.nextFloat();

        double centimetros = metros*100;

        System.out.println("O valor em centímetros é: "+centimetros);

        s.close();

    }

}
