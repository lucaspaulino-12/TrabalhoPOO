import java.time.LocalDate;

public class Animal {
	private String nome;
	private String especie;
	private String genero;
	private Double peso;
	private String raca;
	private int idade;
	private LocalDate dataChegada;
	private boolean esterelizado;
	private boolean adotado;
	private boolean falecido;
	private String observacao;
	
	Animal(String aNome, String aEspecie, String aGenero, Double aPeso, String aRaca, int aIdade, LocalDate aDataChegada, boolean aEsterelizado, String aObservacao){
		this.nome = aNome;
		this.especie = aEspecie;
		this.genero = aGenero;
		this.peso = aPeso;
		this.raca = aRaca;
		this.idade = aIdade;
		this.dataChegada = aDataChegada;
		this.esterelizado = aEsterelizado;
		this.observacao = aObservacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public LocalDate getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(LocalDate dataChegada) {
		this.dataChegada = dataChegada;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	public String mostraAnimal() {
		return "Animal [nome=" + nome + ", especie=" + especie + ", genero=" + genero + ", peso=" + peso + ", raca="
				+ raca + ", idade=" + idade + ", dataChegada=" + dataChegada + ", observacao=" + observacao + "]";
	}
	
	
}