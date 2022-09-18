public class Moto extends Automovel{
	private int freioAbs;
	private int temBau;

	public Moto(String cor, String placa, String modelo, int ligado, int movimento, int freioAbs, int temBau){
		super(cor, placa, modelo, ligado, movimento);
		this.freioAbs = freioAbs;
		this.temBau   = temBau;
	}
	
	@Override
	public void ligar(){
		System.out.println("Moto Ligada!");
		setLigado(1);
	}

	@Override
	public void mover(){
		if(getLigado() == 1){
			System.out.println("Moto em movimento!");
		}
	}

	@Override
	public void parar(){
		if(getMovimento() == 0){
			System.out.println("Moto Parada!");
		}
	}

	public void alarme(){
		System.out.println("Alarme Ligado!");
	}
}