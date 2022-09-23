package ar.com.codoacodo.herencia;

import ar.com.codoacodo.clase6.Libro;
import ar.com.codoacodo.clase6.Musica;
import ar.com.codoacodo.clase6.Pelicula;

public class DBUtil {

	
public Articulo[]	obtenerResultados(String claveBusqueda) {
	 Libro l1 = new Libro("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor1 l1",4390f  );
	 l1.setIsbn("9781654561");
	 l1.setNroPaginas(72);
	 l1.setCantidadVendido(150);
	 
	 
	 // misma forma de pasar los parametros pro constructor
	 Libro l2 = new Libro("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor1 l2",4391f, 72, "9781654561" );
	 l2.setCantidadVendido(100);
	 
	   Musica m1 = new Musica("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor2 m1",6390f, "Sony music", new String[] {}  );
	  m1.setCantidadVendido(250);
	   
	   Musica m2 = new Musica("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor2 m2",3390f  );
	   m2.setSello("warner");
	   m2.setCantidadVendido(500);
	   
	  Pelicula p1 = new Pelicula("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor3 p1",2390f, "Blu-ray","20th centuty fox"  );
	 p1.setCantidadVendido(15);
	   Pelicula p2 = new Pelicula("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor3 p2",3390f  );
	    p2.setFormato("Bue ray 3d");
	    p2.setCantidadVendido(360);
	    
	    Articulo a = new Articulo ("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor Articulo",3390f  );
	    a.setCantidadVendido(560);
	    return new Articulo[] {l1, l2, m1, m2, p1, p2,a};
	    
	   // crear arreglo
	/*   Articulo[] resultados = new Articulo[3]; // vector vacio
	           resultados [0]= primero;
			   resultados [0]= segundo;
			   resultados [0]= tercero;
			  
	   
	   Articulo[] res = new Articulo[] {primero, segundo, tercero}; // crear vector y cargar los datos directamente
	   
	   return res;
			    */
			   
	}
}
