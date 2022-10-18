package ar.com.codoacodo.clase13;

public enum OpcionesEnum {
ALTA ("ALTA", 150),
BAJA("BAJA"),
MODIFICAR ("MODIFICAR"),
ELIMINAR ("ELIMINAR")
;
	
	private String key;
	private Integer otro;
	
private OpcionesEnum(String key, Integer otro) {
	this.key = key;
	this.otro = otro;
}
	
	
private OpcionesEnum(String key) {
	this.key = key;
}
public String getKey() {
	return this.key;
}
}
