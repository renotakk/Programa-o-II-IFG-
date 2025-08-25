package ListaDois;

public class ListaDoisQuestaoQuatro {

    public static void main(String[] args) {

        /* 4. Praticar conversões implícitas e explícitas, faça em linguagem Java:
a. Conversão Explícita (Casting)
i. Declare uma variável do tipo double com um valor inicial.
ii. Converta explicitamente esse valor para int utilizando
casting.
iii. Escreva os dois valores no console (antes e depois da
conversão).
iv. Explique em um comentário de código por que pode haver
perda de dados nessa conversão.

b. Conversão Automática (Sem Casting)
i. Declare uma variável do tipo int com um valor inicial.
ii. Converta automaticamente esse valor para double (sem
usar casting).
iii. Exiba os dois valores no console (antes e depois da
conversão).
iv. Explique em um comentário por que essa conversão é
segura. */

        double x = 9.9; //versão explícita
        int y = (int) x;

        System.out.println(y);
        System.out.println(x);

        //o int nao consegue guardar frações por causa do seu byte


        int a = 20; //versão implícita
        double b = a;

        System.out.println(b);
        System.out.println(a);

        //como o double tem mais espaço por causa do seu byte o int cabe perfeitamente nele

    }

}
