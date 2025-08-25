package ListaQuatro;
import java.util.Scanner;
public class ListaQuatroQuestaoCinco {

    public static void main(String[] args) {

        /* 5. Ano bissexto
a. Descrição: Solicite um ano e informe se é bissexto.
b. Entrada: Um ano (int).
c. Saída: "Bissexto" ou "Não bissexto". */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = s.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) { //ano bissexto é divisível por 4 mas nao por 100 exceto se for por 400
            System.out.println("Bissexto");
        } else {
            System.out.println("Não bissexto");
        }

        s.close();

    }
}