package git;

public class Utente {
	private String nome;
	private String genero;
	private int idade;
	private float altura;
	private int peso;
	
	public Utente(String nome, String genero, int idade, float altura, int peso) {
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		ss
		ss
		
	}

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", genero=" + genero + ", idade=" + idade + ", altura=" + altura + ", peso="
				+ peso + "]";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public static void main(String[]args) {
		System.out.println("novo inccrivel");
	}
	
	public void ola()

}
