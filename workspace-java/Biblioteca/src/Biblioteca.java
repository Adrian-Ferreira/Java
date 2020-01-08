import java.util.Scanner;

public class Biblioteca {
	
	private String titulo; 
	private String autor; 
	private int anoDePublicacao; 
	private String categoria; 
	private int posicaoEstante;
	private int posicaoPrateleira;
	private boolean emprestimo;
	
	public Biblioteca(String titulo, String autor, int anoDePublicacao, String categoria, int posicaoEstante, int posicaoPrateleira, boolean emprestimo) {
		this.titulo            = titulo;
		this.autor             = autor;
		this.anoDePublicacao   = anoDePublicacao;
		this.categoria         = categoria;
		this.posicaoEstante    = posicaoEstante;
		this.posicaoPrateleira = posicaoPrateleira;
		this.emprestimo        = emprestimo;
	} 
	
	public String getTitulo() {
		return titulo;	
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPosicaoEstante() {
		return posicaoEstante;
	}
	public void setPosicaoEstante(int posicaoEstante) {
		this.posicaoEstante = posicaoEstante;
	}
	public int getPosicaoPrateleira() {
		return posicaoPrateleira;
	}
	public void setPosicaoPrateleira(int posicaoPrateleira) {
		this.posicaoPrateleira = posicaoPrateleira;
	}

	public boolean isEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}
	
	void disponivel() {
		if(emprestimo == true) {
			System.out.println("Não esta Disponivel");
		} else {
			System.out.println("Esta Disponivel");
		}
	}
	void emprestar() {
		if(emprestimo == true) {
			System.out.println("Não esta Disponivel");
		} else {
			emprestimo = true;
			System.out.println("Levo amigão. Tá contigo!");			
		}
	}
	void devolver() {
		if(emprestimo == false) {
			System.out.println("Não se devolve oque ja foi devolvido!");
		} else {
			emprestimo = false;
			System.out.println("Devolvido amigão. Tá nois!5");
		}
	}
 
}
