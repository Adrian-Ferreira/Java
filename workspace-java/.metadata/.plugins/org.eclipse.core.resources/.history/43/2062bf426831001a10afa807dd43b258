package uri1101;

import java.util.Scanner;

public class uri1101 {
	public static void main(String agrs[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int X, Y;

		while (((X = teclado.nextInt()) > 0) && ((Y = teclado.nextInt()) > 0)) {
			int sum = 0;
			if (X > Y) {
				for (Y = Y; X >= Y; Y++) {
					sum += Y;
					System.out.print(Y + " ");
				}
				System.out.println("Sum=" + sum);
			} else {
				for (X = X; X <=Y; X++) {
					sum += X;
					System.out.print(X + " ");
				}
				System.out.println("Sum=" + sum);
			}			
		}
		teclado.close();
	}
}
