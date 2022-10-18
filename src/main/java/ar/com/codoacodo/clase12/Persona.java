package ar.com.codoacodo.clase12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;


public class Persona {
private String nombre;
private IIDioma idiomaNativo;
private Collection<IIDioma> otrosIdiomas;

public Persona (String nombre, IIDioma idioma) {
	if (nombre == null || idioma == null) {
		// lanzar una runtime
		throw new RuntimeException("persona sin nombre o sin idioma nativo");
	}
	setNombre(nombre);
	setIdiomaNativo(idioma);
	inicializarOtrosIdiomas();
}

public void aprender(IIDioma nuevoIdioma) throws IdiomaDuplicadoException{
	// debo saber si es el mismo que el nativo
	if(getIdiomaNativo().getClass().equals(nuevoIdioma.getClass() ) ) {
		throw new IdiomaDuplicadoException(getNombre() + " ya habla" + nuevoIdioma.getClass());
	}
	
	//lista de otros idiomas
	for(IIDioma idioma : getOtrosIdiomas()) {
		if(idioma.getClass().equals(nuevoIdioma.getClass() ) ) {
			throw new IdiomaDuplicadoException(getNombre() + "ya habla" + nuevoIdioma.getClass());
		}
	}
	// agregando nuevo idioma
	getOtrosIdiomas().add(nuevoIdioma);
}
public void decir(String algo) {
	// idioma nativo
	getIdiomaNativo().decir(algo);
	//otros idiomas
	for (IIDioma idioma: getOtrosIdiomas() ) {
		idioma.decir(algo);
	}
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public IIDioma getIdiomaNativo() {
	return idiomaNativo;
}

private void setIdiomaNativo(IIDioma idiomaNativo) {
	this.idiomaNativo = idiomaNativo;
}

public Collection<IIDioma> getOtrosIdiomas() {
	return otrosIdiomas;
}

private void inicializarOtrosIdiomas() {
	// cargar lista vacioa para evitar el null
	 this.otrosIdiomas = new ArrayList<>();

}



@Override
public String toString() {
	return "Persona [nombre=" + getNombre() + ", idiomaNativo=" + getIdiomaNativo() + ", otrosIdiomas=" + getOtrosIdiomas() + "]";
}

// sobre escribo el metodo equal() para comparar
@Override
public int hashCode() {
	return Objects.hash(idiomaNativo, otrosIdiomas);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona other = (Persona) obj;
	return Objects.equals(idiomaNativo, other.idiomaNativo) && Objects.equals(otrosIdiomas, other.otrosIdiomas);
}

}
