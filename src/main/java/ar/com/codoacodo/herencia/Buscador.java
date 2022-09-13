package ar.com.codoacodo.herencia;

public class Buscador {
   private  String claveBusqueda;
    private Articulo[] resultados;
     
     
  public Buscador(String claveDelUsuario){
    	//this.claveBusqueda = claveDelUsuario;
    	 this.setClaveBusqueda(claveDelUsuario);
    	// this.resultados = new Articulo[] {};
    	 this.setResultados(new Articulo[]{});
     }
     
     // firma del metodo
   public void  buscar(){
    	 // simular que busco en una bd
	 DBUtil db = new DBUtil();
     this.setResultados( db.obtenerResultados(this.claveBusqueda)  );
  
   
   }
     
     
     public void mostrarResultados () {
    	 System.out.println("Hemos encontrado" + this.cantidadResultados() + "resultados para" + this.getClaveBusqueda());
    	   // for each
         for(Articulo aux : this.getResultados() ) {
       	  System.out.println("titulo: "+ aux.getTitulo() );
       	  System.out.println("Autor: "+ aux.getAutor() );
       	  System.out.println("Img: "+ aux.getImg() );
       	  System.out.println("Precio: "+ aux.getPrecio() );
         }
     }
     
   int  cantidadResultados(){
	   return this.resultados.length;
    	 
     }
     
    void setResultados(Articulo[] resultados) {
	this.resultados = resultados;
}

String getClaveBusqueda () {
	   return this.claveBusqueda;
   }
   
  public Articulo[] getResultados() {
	   return this.resultados;
   }

public void setClaveBusqueda(String claveBusqueda) {
	this.claveBusqueda = claveBusqueda;
}
   
}
