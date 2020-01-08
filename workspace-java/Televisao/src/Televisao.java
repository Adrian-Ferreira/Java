
public class Televisao {
	
	private String   marca;
	private int      voltagem;
	private int      tamanho;
	private boolean  ligada;
	private int      volume;
	private int      canal;
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	
	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV "+marca+" esta "+ ((ligada)?"ligada":"desligada"));
		// Operador ternario de atribuicao condicional
		
	}
	
	void aumentarVolume() {
		if(ligada == false) {
			System.out.println("Ligue a tv vagabundo");
		} else {
			if(volume >=0 && volume <=10) {
				volume++;
				System.out.println("A TV "+marca+ " esta no volume "+volume);
			} else {
				volume = 10;
				System.out.println("Volume no maximo");
			}			
		}		
	}
	void diminuirVolume() {
		if(ligada == false) {
			System.out.println("Ligue a tv vagabundo");
		} else {
			if(volume >=0 && volume <=10) {
				volume--;
				System.out.println("A TV "+marca+ " esta no volume "+volume);
			} else {
				volume = 0;
				System.out.println("Volume no maximo");
			}
		}		
	}
	
	void avancarCanal() {
		if(ligada == false) {
			System.out.println("Ligue a tv vagabundo");
		} else {
			if(canal >=0 && canal <10) {
				canal++;
				System.out.println("A TV "+marca+ " esta no canal "+canal);
			} else {
				canal = 0;
				
			}	
		}		
	}
	
	void voltarCanal() {
		if(ligada == false) {
			System.out.println("Ligue a tv vagabundo");
		} else {
			if(canal >=0 && canal <=10) {
				canal--;
				System.out.println("A TV "+marca+ " esta no canal "+canal);
			} else {
				canal = 10;
				
			}
		}	
	}
}
