package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoSeis {

    public static void main(String[] args) {

        /* 6. Calculadora de salário
Solicite ao usuário o número de horas trabalhadas e o valor por hora, e
calcule o salário total.
a. Entrada: Horas trabalhadas (int) e valor por hora (float).
b. Saída: Salário total. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite quantas horas foram trabalhadas: ");
        int horasTrabalhadas = s.nextInt();

        System.out.print("Digite o valor por hora trabalhada: ");
        float valorHora = s.nextFloat();

        double salario = horasTrabalhadas*valorHora;

        System.out.println("O salário total é: "+salario);

        s.close();

    }

}
