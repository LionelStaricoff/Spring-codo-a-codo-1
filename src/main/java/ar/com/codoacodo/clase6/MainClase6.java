package ar.com.codoacodo.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class MainClase6 {

	public static void main(String[] args) {
		Libro libro1 = new Libro ("/libro.jpg", "iron man", "Alguien", 3500F);
		System.out.println(libro1);
		
		Articulo articulo = new Articulo ("/libro.jpg", "iron man", "Alguien", 3500f);
		// padre a new hijo (contiene inicialmente los atributos de padre)
		Articulo a = new Libro ("/libro.jpg", "iron man", "Alguien", 3500f);
		
		//casteo (downCasting) a con formato de libro y lo guardo en otro libro.
		Libro libroDentroDeA = (Libro)a;
		
		// se puede castear y obtener los atributos directamente
		// String auto = ((Libro)a).getAutor()
		
		//se puede cargar todos en un array del casteo padre
		Articulo [] resultados = new Articulo[] {libro1, articulo};
		
		articulo = libro1;// padre puede contener la referencia de un hijo
		// libro1 = articulo; // un hijo no puede contener la ref de un padre
		// libro1 = musica; // un hermano no puede contener la ref de un padre
		
		//reinstancio a articulo como libro y se comporta como libro y como articulo
		articulo = new Libro ("/libro.jpg", "iron man", "Alguien", 3500F);
	}
}
