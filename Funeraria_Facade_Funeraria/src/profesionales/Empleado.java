package profesionales;

public abstract class Empleado {

	String nombre;
	String id;

	public abstract String getInfo();

	public Empleado(String nombre, String id) {
		this.nombre = nombre;
		this.id = id;
	}

}
