/**
 * 
 */
package lab1;

/**
 * 
 */
public class Utente {
	public Utente(String nome, String genero, int idade, double altura, int peso) {
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}
	private String nome;
	private String genero;
	private int idade;
	private double altura;
	private int peso;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", altura=" + altura + ", peso="
				+ peso + "]";
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}
