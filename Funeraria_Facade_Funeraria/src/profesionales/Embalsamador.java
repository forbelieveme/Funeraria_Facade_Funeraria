package profesionales;

public class Embalsamador extends Empleado {

	public Embalsamador(String nombre, String id) {
		super(nombre, id);
	}

	@Override
	public String getInfo() {
		return "(" + this.nombre + ":" + this.id + ")";
	}

}
