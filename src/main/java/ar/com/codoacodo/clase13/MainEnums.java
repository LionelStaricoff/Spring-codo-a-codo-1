package ar.com.codoacodo.clase13;

public class MainEnums {

	public static void main(String[] args) {
		//algo desde el front
		String filtro = "ALTA";
		String  opcion = "ALTA";
		// valueOf : busca dentro del enum si esta el valor asignado y devuelve el enum de ese valor
		OpcionesEnum _enum = OpcionesEnum.valueOf(filtro);
		
		// values() devuelve un arreglo de los enums y los podes cargar en un arreglo para recorrer
		OpcionesEnum []  _enum1 = OpcionesEnum.values(); 
		
		// busqueda de un enum dado una clave
		for (OpcionesEnum unEnum : _enum1) {
			if(unEnum.equals(filtro)) {
				//logica
			}
			
			System.out.println("revisar enum");
		}
		
		
		
		
		
		
		
		/* ejecuciones de prueva de los casos anteriores
	String opcion = "ALTAa";
		
		seleccionar(opcion);
		
		seleccionar(OpcionesEnum.ALTA);
		*/
		
	}
public static void seleccionar(OpcionesEnum opciones) {
	
	
	
	//un mal uso del enum
	/*
		switch (opciones.getKey() ){
		case "ALTA": {
		System.out.println("es "+ opciones);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opciones.getKey());
		}    
		*/
	}
	
	public static void seleccionar(String opcion) {
	
		
		if("ALTA".equals(opcion)) {
			System.out.println("es "+ opcion);
		}
		
		switch (opcion) {
		case "ALTA": {
			System.out.println("es "+ opcion);
			break;
		}
		case "BAJA": {
			System.out.println("es "+ opcion);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}
}
