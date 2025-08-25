package ListaTres;

import java.util.Scanner;
public class ListaTresQuestaoDois {

    public static void main(String[] args) {

        /*2. Conversão de temperatura
Solicite ao usuário uma temperatura em Celsius e converta para
Fahrenheit. Utilize a fórmula: F = C * 1.8 + 32.
a. Entrada: Temperatura em Celsius (float).
b. Saída: Temperatura equivalente em Fahrenheit. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite quantos graus está fazendo em celsius: ");
        float celsius = s.nextFloat();

        double conversao = celsius * 1.8 + 32; //fórmula da conversão

        System.out.println("Os graus em fahrenheit é: "+conversao);

        s.close();

    }

}
