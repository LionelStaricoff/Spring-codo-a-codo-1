package ar.com.codoacodo.clase12;

public class Ingles extends IdiomaBase implements IIDioma {

	
	public Ingles() {
		super("Ingles");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void decir(String palabra) {
		String valor = getMapDePalabras().get(palabra);
		if(valor!= null) 
			System.out.println(palabra +" en " + getNombre() + " = "+ valor);
		else
		System.out.println("Error....");

	}

	@Override
	public void crearMapaDePalabras() {
		getMapDePalabras().put("hola", "hello");
		getMapDePalabras().put("adios", "god bye");
		getMapDePalabras().put("gracias", "tanks you");
	}

	
}
