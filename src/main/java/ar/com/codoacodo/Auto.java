
//AUTO
package ar.com.codoacodo;

//los nombre de las clases la primer letra es en mayuscula
public class Auto {
	
	/*
	 atributos
	*/
	boolean encendido; //tipos de datos?//false
	float velocidadActual;//alt+shit+r// > 0 
	String marcas;//null
	String modelo;//null
	int anio;//0
	float velocidadMaxima;//0
	
	//todas las clases tienen un constructor por defecto
	//contructor por defecto/explicito
	Auto() {
		//aca va el codigo cuando nace el auto
		this.encendido = false;//esta apagado
		this.velocidadMaxima = 200;
		this.velocidadActual = 0;
	}
	
	//new Auto(250)
	Auto(final float velocidadMaxima) {// const algo = "";
		//this
		this.velocidadActual = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
		
	//metodos
	void encender() {
		if(!encendido) {
			System.out.println("se ha encendido");
			encendido = true;
		}else {
			System.out.println("ya esta encendido");
		}
	}
	
	void apagar() {
		if (encendido) {
			System.out.println("apagado");
		
			
			// poner la velocidad en 0
			this.detener();
			
			this.encendido = false;
		}else {
			System.out.println("ya esta apagado");
		}
	}
	// este acelera de a una unidad
	void acelerar() {
		if(this.encendido) {
			if(this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}else {
				System.out.println("se quema el auto");	
			}
		}else {
			System.out.println("debe encender el auto");
		}
	}
	
	
	void quintaAFondo () {
		if(this.encendido) {
			while (this.velocidadActual < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidadActual++;
			}
		}else {
			System.out.println("debe encender el auto");
		}
	}
	
	void frenar() {
	//	if(this.encendido) {
		if (this.velocidadActual>0) {
				System.out.println("frenando");
				this.velocidadActual--;
			}else {
				System.out.println("llegaste a 0");
			}
//		}else {
		//	System.out.println("auto apagado");
	//	}
	}
	
	void mostrarInfo() {
		System.out.println("encendido:" + encendido);
	}
	
	public void detener() {
		while (this.velocidadActual > 0) {
			this.frenar();
		}
	}
}
