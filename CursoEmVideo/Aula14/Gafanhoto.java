package projetocurso;

public class Gafanhoto extends Pessoa{
	
	public Gafanhoto(String nome, int idade, String sexo, int experiencia, boolean trabalhando, String login) {
		super(nome, idade, sexo, experiencia, trabalhando);
		this.login = login;
	}
	
	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, int experiencia, boolean trabalhando, String login,
			int totAssistido) {
		super(nome, idade, sexo, experiencia, trabalhando);
		this.login = login;
		this.totAssistido = totAssistido;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	public void viuMaisUm() {
		System.out.println("Mandou bem, você viu mais um video!");
	}
	
	
}