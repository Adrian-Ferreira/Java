package uri1165;
import java.util.Scanner;

public class uri1165 {
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
		
		
		
		
		
		
		
		teclado.close();
	}
}
