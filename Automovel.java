public abstract class Automovel {
	private String cor;
	private String placa;
	private String modelo;
	private int ligado;
	private int movimento;

	public Automovel(String cor, String placa, String modelo, int ligado, int movimento){
		this.cor       = cor;
		this.placa     = placa;
		this.modelo    = modelo;
		this.ligado    = ligado;
		this.movimento = movimento;
	}

	public abstract void ligar();

	public abstract void mover();

	public abstract void parar();

	public void setCor(String cor){
		this.cor = cor;
	}

	public String getCor(){
		return this.cor;
	}

	public void setPlaca(String placa){
		this.placa = placa;
	}

	public String getPlaca(){
		return this.placa;
	}

	public void setModelo(String modelo){
		this.modelo = modelo;
	}

	public String getModelo(){
		return this.modelo;
	}

	public void setLigado(int ligado){
		this.ligado = ligado;
	}

	public int getLigado(){
		return this.ligado;
	}

	public void setMovimento(int movimento){
		this.movimento = movimento;
	}

	public int getMovimento(){
		return this.movimento;
	}
}