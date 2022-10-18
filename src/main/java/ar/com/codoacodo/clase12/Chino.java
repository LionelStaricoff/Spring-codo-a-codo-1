package ar.com.codoacodo.clase12;

public class Chino extends IdiomaBase implements IIDioma {

	public Chino() {
		super("Chino");
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
	public void crearMapaDePalabras() {
		getMapDePalabras().put("hola", "nihao");
		getMapDePalabras().put("adios", "adios en chino");
		getMapDePalabras().put("gracias", "gracias en chino");
	}
}
