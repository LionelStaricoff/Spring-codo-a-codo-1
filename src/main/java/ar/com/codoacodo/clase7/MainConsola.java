package ar.com.codoacodo.clase7;

public class MainConsola {

	public static void main(String[] args) {
	
		VendedorConsolas vc = new VendedorConsolas();
		Ijugable algo = vc.vender();
		algo.jugar();
		
		
		Ijugable[] jugables = vc.venderVarios();
		for (Ijugable aux : jugables) {
			aux.jugar();
		}
	}

}
