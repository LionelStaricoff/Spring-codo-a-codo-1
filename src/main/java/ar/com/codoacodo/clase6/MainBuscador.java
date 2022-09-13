package ar.com.codoacodo.clase6;

import ar.com.codoacodo.herencia.Articulo;
import ar.com.codoacodo.herencia.Buscador;

public class MainBuscador {

	public static void main(String[] args) {
	
		String clave = "harry potter";
		Buscador buscador = new Buscador(clave);
		
		buscador.buscar();
		
		Articulo[] resultados = buscador.getResultados();
		
		//simulo la pantalla de resultados
		for (Articulo unResultado : resultados) {
			unResultado.getAutor();
			unResultado.getImg();
			unResultado.getPrecio();
			
			if (unResultado instanceof Libro) {
				Libro ll = (Libro)unResultado;
				ll.getIsbn();
				ll.getNroPaginas();
			}
			if (unResultado instanceof Musica) {
				
			}
			if (unResultado instanceof Pelicula) {
				
			}
			
		}
	}

}
