package ar.com.codoacodo.clase7;

public class XBox extends Consola implements Ijugable {
	

	public XBox(String nombre, String marca) {
		super(nombre, marca);
		// TODO Auto-generated constructor stub
	}

	// por implementar Ijugable esta obligada a escrivir el metodo
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " - jugando......");
	}

}
