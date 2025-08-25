package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoOito {

    public static void main(String[] args) {

        /* 8. Classificação etária
a. Descrição: Solicite a idade de uma pessoa e classifique como
"Criança" (0-12), "Adolescente" (13-17), "Adulto" (18-59) ou
"Idoso" (60+).
b. Entrada: Idade (int).
c. Saída: Classificação etária. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();

        if (idade>=0 && idade<=12) {
            System.out.println("Criança");
        }
        else if (idade>=13 && idade<=17) {
            System.out.println("Adolescente");
        }
        else if (idade>=18 && idade<=59) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Idoso");
        }

        s.close();

    }

}
