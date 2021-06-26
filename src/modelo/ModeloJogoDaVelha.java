package modelo;
/*
 * @Author: Sara
 */
public class ModeloJogoDaVelha {

	private String simboloJogadorAtual = "X";
	private int totalDeJogadas = 0;
	private int numeroPartidas = 0;
	private int numeroEmpates = 0;
	private int numeroVitorias1 = 0;
	private int numeroVitorias2 = 0;
	private boolean temGanhador = false;
	private boolean temEmpate = false;
	
	//Construtor padrão.
	public ModeloJogoDaVelha() {

	}

	//Métodos Getters e Setters
	public String getSimboloJogadorAtual() {
		return simboloJogadorAtual;
	}

	public void setSimboloJogadorAtual(String simboloJogadorAtual) {
		this.simboloJogadorAtual = simboloJogadorAtual;
	}

	public int getTotalDeJogadas() {
		return totalDeJogadas;
	}

	public void setTotalDeJogadas(int totalDeJogadas) {
		this.totalDeJogadas = totalDeJogadas;
	}

	public int getNumeroPartidas() {
		return numeroPartidas;
	}

	public void setNumeroPartidas(int numeroPartidas) {
		this.numeroPartidas = numeroPartidas;
	}

	public int getNumeroEmpates() {
		return numeroEmpates;
	}

	public void setNumeroEmpates(int numeroEmpates) {
		this.numeroEmpates = numeroEmpates;
	}

	public int getNumeroVitorias1() {
		return numeroVitorias1;
	}

	public void setNumeroVitorias1(int numeroVitorias1) {
		this.numeroVitorias1 = numeroVitorias1;
	}

	public int getNumeroVitorias2() {
		return numeroVitorias2;
	}

	public void setNumeroVitorias2(int numeroVitorias2) {
		this.numeroVitorias2 = numeroVitorias2;
	}

	public boolean isTemGanhador() {
		return temGanhador;
	}

	public void setTemGanhador(boolean temGanhador) {
		this.temGanhador = temGanhador;
	}

	public boolean isTemEmpate() {
		return temEmpate;
	}

	public void setTemEmpate(boolean temEmpate) {
		this.temEmpate = temEmpate;
	}
}