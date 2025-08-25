package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoDezoito {

    public static void main(String[] args) {

        /* 18. Calculadora de prestação atrasada
Solicite o valor de uma prestação atrasada, a taxa de juros mensal e o
número de meses de atraso, e calcule o valor total a pagar. Fórmula:
valor_total = valor + (valor * taxa * meses).
a. Entrada: Valor da prestação (float), taxa de juros (float) e meses
de atraso (int).
b. Saída: Valor total a pagar. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor da prestação atrasada(sem juros): ");
        float valor = s.nextFloat();

        System.out.print("Digite a taxa de juros: ");
        double taxa = s.nextFloat()/100.0; //passando para forma decimal

        System.out.print("Digite os meses de atraso: ");
        int meses = s.nextInt();

        double valorTotal = valor+(valor*taxa*meses);

        System.out.println("O valor total a pagar é: "+valorTotal);

        s.close();

    }

}
