package profesionales;

public class Director_Funerario extends Empleado {

	public Director_Funerario(String nombre, String id) {
		super(nombre, id);
	}

	@Override
	public String getInfo() {
		return "(" + this.nombre + ":" + this.id + ")";
	}

}
