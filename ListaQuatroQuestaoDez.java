package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoDez {

    public static void main(String[] args) {

        /* 10. Calculadora de operações básicas
a. Descrição: Solicite dois números e uma operação (+, -, *, /).
Exiba o resultado ou informe erro para divisão por zero.
b. Entrada: Dois números e um operador.
c. Saída: Resultado da operação ou mensagem de erro. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        double n1 = s.nextDouble();

        System.out.print("Digite o 2° número: ");
        double n2 = s.nextDouble();

        System.out.print("Digite a operação(+, -, *, /): ");
        char operacao = s.next().charAt(0);

        double resultado;

        switch (operacao) {
            case '+':
                resultado = (n1+n2);
                break;
            case '-':
                resultado = (n1-n2);
                break;
            case '*':
                resultado = (n1*n2);
                break;
            case '/':
                if (n2 !=0) {
                    resultado = (n1/n2);
                }
                else {
                    System.out.println("Erro na divisão");
                    s.close();
                    return;
                }
                break;
            default:
                System.out.println("Operação inválida");
                s.close();
                return;

        }
        System.out.printf("Resultado: %.2f\\n", resultado);

        s.close();


    }

}
