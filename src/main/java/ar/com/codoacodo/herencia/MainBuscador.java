package ar.com.codoacodo.herencia;

public class MainBuscador {

	public static void main(String[] args) {
		// simulo que el usuario escribio algo
		String claveDelUsuario = "iron man";
		
      Buscador miBuscador = new Buscador(claveDelUsuario);
     // miBuscador.claveBusqueda = claveDelUsuario;
      miBuscador.setClaveBusqueda(claveDelUsuario);
      miBuscador.buscar();
      
      
      
   miBuscador.mostrarResultados();
      
	}

}
