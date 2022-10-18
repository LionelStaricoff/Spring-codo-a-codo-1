package ar.com.codoacodo.clase12;

public class Espanol extends IdiomaBase implements IIDioma {

	
	
	public Espanol() {
		super("Español");
		// TODO Auto-generated constructor stub
	}

	public void decir(String palabra) {
		String valor = getMapDePalabras().get(palabra);
		if(valor!= null) 
			System.out.println(palabra +" en " + getNombre() + " = "+ valor);
		else
		System.out.println("Error....");

	}
	public void crearMapaDePalabras() {
		getMapDePalabras().put("hola", "hola");
		getMapDePalabras().put("adios", "adios");
		getMapDePalabras().put("gracias", "gracias");
	}
}
