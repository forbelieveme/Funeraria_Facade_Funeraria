package funeraria;

import profesionales.Empleado;
import singleton.Impresora;

public class Transporte {

	String descripcion;
	Empleado director;
	Difunto difunto;
	Empleado chofer;

	public Transporte(String descripcion, Empleado director, Difunto difunto, Empleado chofer) {
		this.descripcion = descripcion;
		this.director = director;
		this.difunto = difunto;
		this.chofer = chofer;
	}

	public void transportarCoronas() {
		Impresora.getInstance().imprimir(descripcion + "/" + director.getInfo() + "/" + difunto.getInfo() + "/ transportando coronas...");
	}

	public void transportarDifunto() {
		Impresora.getInstance().imprimir(descripcion + "/" + chofer.getInfo() + "/" + difunto.getInfo() + "/ transportando difunto...");
	}

}
