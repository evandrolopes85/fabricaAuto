public class Carro extends Automovel{
	private int tetoSolar;
	private int aberto;

	public Carro(String cor, String placa, String modelo, int ligado, int movimento, int tetoSolar, int aberto){
		super(cor, placa, modelo, ligado, movimento);
		this.tetoSolar = tetoSolar;
		this.aberto    = aberto;
	}

	@Override
	public void ligar(){
		System.out.println("Carro Ligado!");
		setLigado(1);
	}

	@Override
	public void mover(){
		if(getLigado() == 1){
			System.out.println("Carro em movimento!");
		}
	}

	@Override
	public void parar(){
		if(getMovimento() == 0){
			System.out.println("Carro Parado!");
		}
	}

	public void abrirFechar(){
		if(this.aberto == 1){
			System.out.println("Carro aberto!");
		}else{
			System.out.println("Carro fechado!");
		}
	}
}