
package comparacao;

import java.util.Scanner;

public class Comparar {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1;
		int n2;

		System.out.println("Entre com o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("Entre com o segundo número: ");
		n2 = leia.nextInt();

		if (n1 == n2)
			System.out.printf("%d == %d%n", n1, n2);

		if (n1 != n2)
			System.out.printf("%d != %d%n", n1, n2);

		if (n1 < n2)
			System.out.printf("%d < %d%n", n1, n2);

		if (n1 > n2) 
			System.out.printf("%d > %d%n", n1, n2);
		
		if (n1 <= n2) 
			System.out.printf("%d <= %d%n", n1, n2);
		
		if (n1 >= n2) 
			System.out.printf("%d >= %d%n", n1, n2);
		

		leia.close();
	}

}
