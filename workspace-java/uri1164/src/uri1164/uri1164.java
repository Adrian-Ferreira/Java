package uri1164;

import java.util.Scanner;

public class uri1164 {
	public static void main(String agrs[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int quantidade, soma;
		soma = 0;

		quantidade = teclado.nextInt();
		int numero[] = new int[quantidade];

		for (int i = 0; i < quantidade; i++) {

			numero[i] = teclado.nextInt();

		}

		for (int i = 0; i < quantidade; i++) {
			int cont = 0;
			soma = 0;
			while (soma < numero[i]) {
				cont++;
				if (numero[i] % cont == 0) {
					soma += cont;
				}
			}

			if (soma == numero[i]) {
				System.out.println(numero[i] + " eh perfeito");
			} else {
				System.out.println(numero[i] + " nao eh perfeito");
			}
		}
		teclado.close();
	}
}
