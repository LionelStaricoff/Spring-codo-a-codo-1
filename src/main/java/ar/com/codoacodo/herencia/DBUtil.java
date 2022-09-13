package ar.com.codoacodo.herencia;

import ar.com.codoacodo.clase6.Libro;
import ar.com.codoacodo.clase6.Musica;
import ar.com.codoacodo.clase6.Pelicula;

public class DBUtil {

	
public Articulo[]	obtenerResultados(String claveBusqueda) {
	 Libro l1 = new Libro("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor1 l1",4390f  );
	 l1.setIsbn("9781654561");
	 l1.setNroPaginas(72);
	 
	 // misma forma de pasar los parametros pro constructor
	 Libro l2 = new Libro("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor1 l2",4390f, 72, "9781654561" );
	 
	   Musica m1 = new Musica("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor2 m1",6390f, "Sony music", new String[] {}  );
	   Musica m2 = new Musica("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor2 m2",3390f  );
	   m2.setSello("warner");
	   
	  Pelicula p1 = new Pelicula("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor3 p1",2390f, "Blu-ray","20th centuty fox"  );
	 
	   Pelicula p2 = new Pelicula("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor3 p2",3390f  );
	    p2.setFormato("Bue ray 3d");
	    
	    Articulo a = new Articulo ("http://sitio.com/img/img.jpg", "titulo" + claveBusqueda,"autor Articulo",3390f  );
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
