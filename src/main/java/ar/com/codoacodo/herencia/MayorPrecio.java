package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MayorPrecio extends FiltroBase implements Ifiltro{
	
	public MayorPrecio() {
		super("Mayor Precio");
	}

	public MayorPrecio(Articulo[]lista) {
		super("Mayor Precio",lista);
	}

	public void ordenar() {
	
		System.out.println("ordenando por mayor precio");
		Arrays.sort(lista, (a, b) -> Float.compare(b.getPrecio(), a.getPrecio() ) );
		
	}

}
