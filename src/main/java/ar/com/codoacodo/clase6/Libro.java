package ar.com.codoacodo.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class Libro extends Articulo {
    
	private int nroPaginas;
	private  String isbn;
	
	
	
	public Libro (String img, String titulo, String autor, Float precio) {
		// la primer linea de codigo del constructor debe ser invicar al constructor del padre
		super (img, titulo,autor, precio);
	}
	
	
	public Libro (String img, String titulo, String autor, Float precio, int nroPaginas, String isbn) {
		super (img, titulo,autor, precio);
		// seteo lo que es propio del hijo
		this.setNroPaginas(nroPaginas);
		this.setIsbn(isbn);
		
	}


	public int getNroPaginas() {
		return nroPaginas;
	}


	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	@Override
	public String toString() {
		return super.toString()+ " ,Libro [nroPaginas=" + nroPaginas + ", isbn=" + isbn + "]";
	}
	

	
}
