package projetocurso;

public class ProjetoCursoPOO {

	public static void main(String[] args) {
		//Criando uma array com 3 espaços
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 excel");
		v[2] = new Video ("Aula 16 Power BI");

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileu", 22, "M", 0, false, "Juba");
		g[1] = new Gafanhoto("Cleber", 49, "M", 0, true, "Clebinho");
		
		System.out.println(v[0].toString());
		System.out.println(g[1].toString());
	}