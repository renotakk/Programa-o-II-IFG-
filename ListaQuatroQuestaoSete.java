package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoSete {

    public static void main(String[] args) {

        /* 7. Salário com imposto
a. Descrição: Solicite o salário de um funcionário e calcule o
imposto:
i. 10% para salários acima de R$3.000,00;
ii. 5% para salários entre R$1.000,00 e R$3.000,00;
iii. Isento para salários abaixo de R$1.000,00.
b. Entrada: Salário (float).
c. Saída: Valor do imposto e salário líquido. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        float salario  = s.nextFloat();

        if (salario>3000) {
            double imposto10 = salario*1.1; //1.1 aumenta 10%
            System.out.printf("O salário total de R$%.2f + 10%% de imposto é R$%.2f\n", salario, imposto10);
        }
        else if (salario>=1000 && salario<=3000) {
            double imposto5 = salario*1.05; //1.05 aumenta 5%
            System.out.printf("O salário total de R$%.2f + 5%% de imposto é R$%.2f\n", salario, imposto5);
        }
        else {
            System.out.printf("O salário total de R$%.2f é livre de imposto\n", salario);
        }

        s.close();

    }

}
