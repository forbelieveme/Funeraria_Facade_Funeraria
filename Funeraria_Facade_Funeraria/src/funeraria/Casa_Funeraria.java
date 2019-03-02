package funeraria;

import profesionales.Empleado;
import singleton.Impresora;

public class Casa_Funeraria {

	String descripcion;
	Empleado director;
	Empleado sacerdote;
	Empleado embalsamador;
	Difunto difunto;

	public Casa_Funeraria(String descripcion, Empleado director, Empleado sacerdote,
			Empleado embalsamador, Difunto difunto) {
		this.descripcion = descripcion;
		this.director = director;
		this.sacerdote = sacerdote;
		this.embalsamador = embalsamador;
		this.difunto = difunto;
	}

	public void embalsamarDifunto() {
		Impresora.getInstance().imprimir(descripcion + "/" + embalsamador.getInfo() + "/" + difunto.getInfo() + "/ embalsamando...");
	}

	public void velarDifunto() {
		Impresora.getInstance().imprimir(descripcion + "/" + director.getInfo() + "/" + difunto.getInfo() + "/ velando...");
	}

}
