package ar.com.codoacodo.herencia.clase8;

import ar.com.codoacodo.herencia.Ifiltro;
import ar.com.codoacodo.herencia.MasVendidos;
import ar.com.codoacodo.herencia.MayorPrecio;
import ar.com.codoacodo.herencia.MenorPrecio;

public class CreadorDeFiltros {
	public static Ifiltro crearFiltro(String clave) {
		Ifiltro filtro;
		
		 switch (clave) {
			case "MASVENDIDOS":
				filtro = new MasVendidos();
				break;
			case "MAYORPRECIO":
				filtro = new MayorPrecio();
				break;
			case "MENORPRECIO":
				filtro = new MenorPrecio();
				break;
			default:
				filtro = new MasVendidos();
				break;
			}
		 return filtro;
	}

	public static Ifiltro crearFiltroDefault() {
		// TODO Auto-generated method stub
		return crearFiltro("MAYORPRECIO");
	}

}
