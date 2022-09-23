package ar.com.codoacodo.clase7;

public class PlayStation extends Consola implements Ijugable {
	
	public PlayStation(String nombre, String marca) {
		super(nombre, marca);
		// TODO Auto-generated constructor stub
	}

	private boolean chipeada;
	
	
	public boolean isChipeada() {
		return chipeada;
	}
	
	
	public void chipear() {
		if(!isChipeada() ) {
			setChipeada(true);
		}
	}


	private void setChipeada(boolean chipeada) {
	this.chipeada = chipeada;
		
	}
	
	// por implementar Ijugable esta obligada a escrivir el metodo
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " - jugando......");
	}

}
