package uri1044;

import java.util.Scanner;

public class uri1044 {
	public static void main(String agrs[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int v1, v2;
		
		v1 = teclado.nextInt();
		v2 = teclado.nextInt();
		
		if(v1 % v2 == 0 || v2 % v1 == 0) {
			 
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
		
		
		teclado.close();
	}

}
