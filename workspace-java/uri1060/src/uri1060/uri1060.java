package uri1060;
import java.util.Scanner;

public class uri1060 {
	public static void main(String agrs[]) {
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int qtd = 0;
	
		for(int i=0;i<6;i++) {
			
			double n1;
			
			n1 = teclado.nextDouble();
			
			if(n1>0){
				qtd++;
			}			
		}	
		
		System.out.println(qtd+" valores positivos");
		
		teclado.close();
	}	
}
