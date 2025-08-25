package ListaTres;
import java.util.Scanner;
public class ListaTresQuestaoDezessete {

    public static void main(String[] args) {

        /* 17. Cálculo do custo de uma viagem
Solicite a distância a ser percorrida, o consumo do veículo (km/l) e o
preço do combustível por litro, e calcule o custo total da viagem.
a. Entrada: Distância (float), consumo (float) e preço do
combustível (float).
b. Saída: Custo total. */

        Scanner s = new Scanner(System.in);

        System.out.print("Digite a distancia a ser percorrida: ");
        float distancia = s.nextFloat();

        System.out.print("Digite o consumo do veiculo(km/l): ");
        float consumo = s.nextFloat();

        System.out.print("Digite o preço do combustivel: ");
        float combustivel = s.nextFloat();

        double calculoValorTotal = (distancia/consumo)*combustivel;

        System.out.println("O custo total é: "+calculoValorTotal);

        s.close();

    }

}
