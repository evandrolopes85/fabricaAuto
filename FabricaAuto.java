public class FabricaAuto{
	public static void main(String[] args){
		Automovel[] automovel = new Automovel[4];

		automovel[0] = new Carro("Preta", "ABC-0001", "Uno", 0, 1, 1, 0);
		automovel[1] = new Moto("Branca", "MTO-0001", "Ronda", 1, 1, 1, 1);
		automovel[2] = new Carro("Preta", "ABC-0001", "Uno", 1, 1, 1, 0);
		automovel[3] = new Moto("Azul", "MTO-0002", "Bis", 0, 0, 1, 1);

		automovel[0].ligar();
	}
}