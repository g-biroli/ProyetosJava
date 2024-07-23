package projetocurso;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	protected boolean trabalhando;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	public boolean isTrabalhando() {
		return trabalhando;
	}


	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}


	public Pessoa(String nome, int idade, String sexo, int experiencia, boolean trabalhando) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.experiencia = 0;
		this.trabalhando = trabalhando;
	}


	public void ganharExp() {
		if (trabalhando == true) {
			System.out.println("Você está adquirindo experiência!");
		} else {
			System.out.println("Você precisa trabalhar e estudar para adquirir experiência");
		}
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", experiencia=" + experiencia
				+ ", trabalhando=" + trabalhando + "]";
	}
	
}