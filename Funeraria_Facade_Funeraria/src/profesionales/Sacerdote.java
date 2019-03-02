package profesionales;

public class Sacerdote extends Empleado{

	public Sacerdote(String nombre, String id) {
		super(nombre, id);
	}

	@Override
	public String getInfo() {
		return "(" + this.nombre + ":" + this.id + ")";
	}

}
