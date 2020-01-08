package uri1143;
import java.util.Scanner;

public class uri1143 {
	public static void main(String agrs[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int linhas;
		
		linhas = teclado.nextInt();
		
		for(int i=1;i<=linhas;i++) {
			
			System.out.println(i + " " + i*i + " " + i * i * i);
		}
		
		teclado.close();
	}

}
