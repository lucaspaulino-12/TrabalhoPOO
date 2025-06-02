public class Racao {
    private String especie;
    private String marca;
    private int idadeMinima;
    private double precoPorKg;

    public Racao(String especie, String marca, int idadeMinima, double precoPorKg) {
        this.especie = especie;
        this.marca = marca;
        this.idadeMinima = idadeMinima;
        this.precoPorKg = precoPorKg;
    }

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	public double getPrecoPorKg() {
		return precoPorKg;
	}

	public void setPrecoPorKg(double precoPorKg) {
		this.precoPorKg = precoPorKg;
	}
    
    
    
}