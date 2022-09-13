
package ar.com.codoacodo;


public class Main {

	public static void main(String[] args) {
		
		//5 km
		Auto miPrimerAuto = new Auto(5);//f3 f5		

		miPrimerAuto.encender();
		
		miPrimerAuto.quintaAFondo();
	
		
		System.out.println("ahora frenando");
		
		//  miPrimerAuto.detener();
		
		miPrimerAuto.apagar();
	System.out.println("fin");
	}

}
