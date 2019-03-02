package funeraria;

import profesionales.Empleado;
import singleton.Impresora;

public class Cementerio {

	String descripcion;
	Empleado director;
	Empleado sacerdote;
	Difunto difunto;

	public Cementerio(String descripcion, Empleado director, Empleado sacerdote, Difunto difunto) {
		this.descripcion = descripcion;
		this.director = director;
		this.sacerdote = sacerdote;
		this.difunto = difunto;
	}

	public void misaDifunto() {
		Impresora.getInstance()
				.imprimir(descripcion + "/" + director.getInfo() + "/" + sacerdote.getInfo() + "/" + difunto.getInfo() + "/ momento religioso...");
	}

	public void enterrarDifunto() {
		Impresora.getInstance().imprimir(descripcion + "/" + difunto.getInfo() + "/ enterrando...");
	}
}
