import java.util.Scanner;
public class AppQueTestaTV {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		Televisao t1;				// declarei que t1 vai "manipular" uma tv
		t1 = new Televisao();		// reservo um espa�o na mem�ria para isso 
		
		t1.setMarca    ("Sony");
		t1.setVoltagem (110);
		t1.setTamanho  (32);
		t1.setLigada   (false);
		t1.setCanal    (9);
		t1.setVolume   (2);
		
		do {
			System.out.println("**************************");
			System.out.println("    Controle Remoto da TV ");
			System.out.println("--------------------------");
			System.out.println(" 1 - ligar/Desligar       ");
			System.out.println(" 2 - Aumentar Volume      ");
			System.out.println(" 3 - Diminuir Volume      ");
			System.out.println(" 4 - Avancar Canal        ");
			System.out.println(" 5 - Voltar Canal         ");
			System.out.println(" 6 - Encerrar Sistema     ");
			System.out.println("**************************");
			opcao = teclado.nextInt();
			
			//logica das op��es
			switch(opcao) {
			case 1:
				t1.switchPower();
				break;
			case 2:
				t1.aumentarVolume();
				break;
			case 3:
				t1.diminuirVolume();
				break;
			case 4:
				t1.avancarCanal();
				break;
			case 5:
				t1.voltarCanal();
				break;
			}
			System.out.println("\n");
		} while(opcao != -1);
		
		teclado.close();
	}
}

