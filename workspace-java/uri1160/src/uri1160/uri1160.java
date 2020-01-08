package uri1160;

import java.util.Scanner;

public class uri1160 {
	public static void main(String agrs[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int t = 1, ANOS;
		int PA, PB;
		double G1, G2;

		t = teclado.nextInt();
		
		String msg[] = new String [t];
		
		int cont = 0;
		
		while (t > 0) {

			PA = teclado.nextInt();
			PB = teclado.nextInt();
			G1 = teclado.nextDouble();
			G2 = teclado.nextDouble();

			ANOS = 0;

			while (PA <= PB) {

				PA += PA * (G1 / 100.0);
				PB += PB * (G2 / 100.0);

				ANOS++;
			}
			
			if (ANOS > 100) {
				msg[cont] = "Mais de 1 seculo.";
				PA = PB + 1;
			}else {
				msg[cont] =(ANOS+" anos.");
			}
			t = t - 1;
			cont++;
		}
		
		for(int i = 0; i< cont; i++) {
			System.out.println(msg[i]);
		}
		teclado.close();
	}

}
