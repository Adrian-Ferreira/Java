import java.util.Scanner;

public class ExemploLeitura {
	
	public static void main(String agrs[]){
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int a;
		float b;
		String texto;
		
		
		System.out.print("Digite um nome");
		texto = teclado .nextLine();
		System.out.print("Digite um numero inteiro ");
		a = teclado.nextInt();
		System.out.print("Digite um valor real ");
		b = teclado.nextFloat();
		
		System.out.println("O texto digitado vale:");
		System.out.println(texto);
		System.out.println("Voce digitou os valores "+a+" e "+b);
		
		
		teclado.close();
		
		
	}
}
