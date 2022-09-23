package ar.com.codoacodo.clase7;

public class VendedorConsolas {
	
	public Ijugable vender() {
		return new Tablet();
		
	}
	
	public Ijugable[] venderVarios() {
		
		PlayStation play = new PlayStation("play3", "sony");
		Wii wii = new Wii("xbox", "microsoft");
		XBox xbox = new XBox("nintendo wii", "nintendo");
		Tablet tablet = new Tablet();
		
	
		
		Ijugable[] jugables = new Ijugable[4];
		jugables [0] = play;
		jugables [1] = wii;
		jugables [2] = xbox;
		jugables [3] = tablet;
		
		return jugables;
	}

}
