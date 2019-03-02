package funeraria;

public class Difunto {

	String nombre;

	public Difunto(String nombre) {
		this.nombre = nombre;
	}

	public String getInfo() {
		return "("+this.nombre+")";
	}
}
