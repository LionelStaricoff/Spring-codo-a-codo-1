package ar.com.codoacodo.herencia.clase8;

import ar.com.codoacodo.herencia.Buscador;
import ar.com.codoacodo.herencia.Ifiltro;


public class MainBuscador {

	public static void main(String[] args) {
	
		String clave = "harry potter";
		
		
		Buscador buscador = new Buscador(clave);
		
		buscador.buscar();
		buscador.mostrarResultados();
		
		System.out.println("--------");
		buscador.ordenar();
		buscador.mostrarResultados();
		System.out.println("--------");
		
	    String claveOrden = "MASVENDIDOS";
	    Ifiltro filtro = CreadorDeFiltros.crearFiltro(claveOrden);
	    buscador.cambiarFiltro(filtro);
	    
		buscador.ordenar();
	
		buscador.mostrarResultados();
		
		System.out.println("--------");
		
		    claveOrden = "MENORPRECIO";
		    filtro = CreadorDeFiltros.crearFiltro(claveOrden);
		    buscador.cambiarFiltro(filtro);
		    
			buscador.ordenar();
		
			buscador.mostrarResultados();
			
			System.out.println("--------");
	}

}
