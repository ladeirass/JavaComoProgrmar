package codigos;

import java.util.Scanner;

public class Adicao {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int n1;
        int n2;
        int soma;

        System.out.print("Entre com um número: ");
        n1 = leia.nextInt();

        System.out.print("Entre com  o segundo número: ");
        n2 = leia.nextInt();

        soma = n1 + n2;

        System.out.printf("A soma dos numeros: %d%n", soma);

        leia.close();

    }

}