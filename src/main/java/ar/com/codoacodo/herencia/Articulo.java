package ar.com.codoacodo.herencia;

import java.util.Date;

public class Articulo {
     
	
	protected String img;
	private String titulo;
	private String autor;
	private Float precio;
	private Date fechaPublicacion;//usamos para ordenar
	private int cantidadVendido;//usamos para ordenar
	public Articulo(String img, String titulo, String autor, Float precio) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	public String getImg() {
		
		return img;
	
	}
	public void setImg(String img) {
		if(img!=null)
		this.img = img;
		else 
			this.img ="marca de agua";
	}
	public String getTitulo() {
	/*	if(titulo!=null) {
			this.titulo = this.titulo.toUpperCase();
		}
			return this.titulo;   */
		return this.titulo!=null ?  this.titulo.toUpperCase(): this.titulo ;
		
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	public int getCantidadVendido() {
		return cantidadVendido;
	}
	public void setCantidadVendido(int cantidadVendido) {
		this.cantidadVendido = cantidadVendido;
	}
	
	
}
