package ar.com.codoacodo.herencia.xyz;

import ar.com.codoacodo.clase6.Libro;
import ar.com.codoacodo.clase6.Musica;
import ar.com.codoacodo.clase6.Pelicula;
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
			System.out.println(unResultado); // imprimo todo el arreglo
			
			//propios de articulos
/*			unResultado.getAutor();
			unResultado.getImg();
			unResultado.getPrecio();
			
			if (unResultado instanceof Libro) { //filtramos los libros del arreglo
				Libro ll = (Libro)unResultado;
				ll.getIsbn();
				ll.getNroPaginas();
			}
			if (unResultado instanceof Musica) {
				Musica m1 = (Musica) unResultado;
				m1.getSello();
				m1.getTemas();
				
			}
			if (unResultado instanceof Pelicula) {
				
				Pelicula p1 = (Pelicula)unResultado;
				p1.getProductora();
				p1.getFormato();
			}
			*/
		}
	}

}
