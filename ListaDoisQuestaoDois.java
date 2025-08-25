package ListaDois;

import java.util.Scanner;

public class ListaDoisQuestaoDois {

    public static void main(String[] args) {

        /* 2. Utilizando a linguagem Java, implemente um código que, dado o raio de
um círculo, calcule sua área. Utilize operadores aritméticos. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o raio do circulo para obter o resultado do calculo da area: "); //usuario digitará o raio do circulo
        double raio = s.nextDouble();
        double pi = Math.PI; //valor de pi

        double areaCirculo = pi*(raio*raio); //calculo da area

        System.out.println("O valor da area é: "+areaCirculo);

        s.close();

    }

}
