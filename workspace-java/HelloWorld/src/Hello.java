
public class Hello {

	public static void main(String args[]) {
		
		float salarioMinimo, qtdeKw;
		
		salarioMinimo = Float.parseFloat(args[0]);
		qtdeKw        = Float.parseFloat(args[1]);
		
		float v1 = salarioMinimo / 700;
		float v2 = qtdeKw * v1;
		float v3 = v2 - (v2*10)/100;
		
		
	
		System.out.println("Valor somado = "+ v1 );
		System.out.println("Valor somado = "+ v2 );
		System.out.println("Valor somado = "+ v3 );
				
	}	
}
