package uri1045;

import java.util.Scanner;

public class uri1045 {
	public static void main(String agrs[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		double a, b, c, aux;

		int i;

		a = teclado.nextDouble();
		b = teclado.nextDouble();
		c = teclado.nextDouble();

		double vet[] = { a, b, c };

		for (i = 0; i < 3; i++) {
			for (int j = 1; j < (3 - i); j++) {

				if (vet[j - 1] < vet[j]) {
					aux = vet[j - 1];
					vet[j - 1] = vet[j];
					vet[j] = aux;
				}
			}
		}

		double A = vet[0];
		double B = vet[1];
		double C = vet[2];

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((A * A) == (B * B) + (C * C)) {
				System.out.println("TRIANGULO RETANGULO");
			} else {

				if ((A * A) > (B * B) + (C * C)) {
					System.out.println("TRIANGULO OBTUSANGULO");
				} else {

					if ((A * A) < (B * B) + (C * C)) {
						System.out.println("TRIANGULO ACUTANGULO");
					}
				}
			}
		}

		if (A == B && A == C) {
			System.out.println("TRIANGULO EQUILATERO");
		}

		else {
			if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");

				teclado.close();
			}
		}
	}

}
