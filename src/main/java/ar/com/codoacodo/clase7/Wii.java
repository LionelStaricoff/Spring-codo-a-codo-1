package ar.com.codoacodo.clase7;

public class Wii extends Consola implements Ijugable {
	
private int cantidadmandos;
public Wii (String nombre, String marca) {
	super(nombre, marca);
	this.setCantidadmandos(2);
}
	private void setCantidadmandos(int cantidadmandos) {
	this.cantidadmandos = cantidadmandos;
	
}
	
	public int getCantidadmandos() {
		return cantidadmandos;
	}
	// por implementar Ijugable esta obligada a escrivir el metodo
	public void jugar() {
		System.out.println(getNombre() + " " + getMarca() + " - jugando......");
	}

}
