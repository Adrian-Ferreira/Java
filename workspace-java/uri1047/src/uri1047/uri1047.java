package uri1047;

import java.util.Scanner;

public class uri1047 {
	public static void main(String agrs[]) {

		Scanner teclado;
		teclado = new Scanner(System.in);

		int hi, mi, hf, mf, dh, dm;

		hi = teclado.nextInt();
		mi = teclado.nextInt();
		hf = teclado.nextInt();
		mf = teclado.nextInt();

		if (hf > hi && mf < mi) {
			dh = 0;
		} else if (mf < mi) {
				dh = 23;
		} else if (hf > hi) {
				dh = hf - hi;
		} else {
				dh = (24 - hi) + hf;
		}
		
		

		if (mf > mi) {
			dm = mf - mi;
		} else if (mi == mf) {
			dm = 0;
		} else {
			dm = (60 - mi) + mf;
		}

					
			
		
		System.out.println("O JOGO DUROU " + dh + " HORA(S) E " + dm + " MINUTO(S)");

		teclado.close();

	}
}
