package uri1017;

import java.util.Scanner;

public class uri1017 {
	public static void main(String agrs[]){
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		double tempo, velocidade;
		
		tempo = teclado.nextDouble();
		velocidade = teclado.nextDouble();
		
		double litros = (tempo*velocidade) /12;
		
		System.out.printf("%.3f\n", litros);
		
		
		teclado.close();

 }
}
