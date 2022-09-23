package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MenorPrecio extends FiltroBase implements Ifiltro{
	
	

	public MenorPrecio() {
		super("Mayor Precio");
	}
	
	public MenorPrecio(Articulo[]lista) {
		super("Mayor Precio",lista);
	}

	public void ordenar() {
	
		System.out.println("ordenando por mayor precio");
		Arrays.sort(lista, (a, b) -> Float.compare(b.getPrecio(), a.getPrecio() ) );
		
	}

}
