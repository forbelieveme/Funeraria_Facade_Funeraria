package profesionales;

public class Chofer extends Empleado{

	public Chofer(String nombre, String id) {
		super(nombre, id);
	}

	@Override
	public String getInfo() {
		return "("+this.nombre+":"+this.id+")";
	}


	

}
