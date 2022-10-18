package ar.com.codoacodo.clase12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IdiomasMain {

	public static void main(String[] args) throws IdiomaDuplicadoException {
		IIDioma chino = new Chino();
		Ingles ingles = new Ingles();
		Espanol espanol = new Espanol();

		
		Persona persona = new Persona ("juan", ingles);
		
		String algo = "hola";
		persona.decir(algo);
		persona.aprender(chino);
		persona.aprender(espanol);
		persona.decir(algo);
		
		Persona persona1 = new Persona ("Teresa", ingles);
		persona1.aprender(chino);
		
		
		Persona persona2 = new Persona ("pedro", espanol);
		persona2.aprender(ingles);
		
		Persona persona3 = new Persona ("Alberto", espanol);
		persona3.aprender(ingles);
		
		
		// simulo que ya vienen en una lista
		Collection <Persona> simulaDatos = new ArrayList<>();
		simulaDatos.add(persona);
		simulaDatos.add(persona1);
		simulaDatos.add(persona2);
		simulaDatos.add(persona3);
		
		
		//realizando busqueda
		Persona entrada = new Persona ("entrada", ingles);
		Collection <Persona> filtrados = new ArrayList<>();
		
		
		
		
		
		
		Iterator<Persona> pFiltro = simulaDatos.iterator();
		while(pFiltro.hasNext()) {
			
			Collection <Persona> filtrado = filtrados;
			Persona p =  pFiltro.next();
			System.out.println(p);
			if(p.getIdiomaNativo().equals(entrada.getIdiomaNativo()) || p.getOtrosIdiomas().equals(entrada.getOtrosIdiomas())  ) {
			filtrado.add(p);
			}
		}
		
		System.out.println("iterando los filtros: ");
		 for (Persona per : filtrados) {
			System.out.println(per);
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	/*	
		Iterator<Persona> filtroPersonas = simulaDatos.iterator();
	
		while(filtroPersonas.hasNext() ) {
			Persona filtro = filtroPersonas.next();
			if(ingles.equals(filtro.getOtrosIdiomas() )) {
				System.out.println(filtro);
				filtrados.add(filtro);
			}  
		}  
		Persona personasEntrada = new Persona("filtro", chino);
		
		for (Persona personas : simulaDatos) {
			if(personasEntrada.getIdiomaNativo().equals(persona.getIdiomaNativo()) || personasEntrada.getOtrosIdiomas().equals(persona.getOtrosIdiomas())) {
				System.out.println(personas.toString());
				filtrados.add(personas);
			}
		} */
	}

}
