package main;

import funeraria.Casa_Funeraria;
import funeraria.Cementerio;
import funeraria.Difunto;
import funeraria.Funeraria;
import funeraria.Transporte;
import profesionales.Chofer;
import profesionales.Director_Funerario;
import profesionales.Embalsamador;
import profesionales.Empleado;
import profesionales.Sacerdote;

public class Prueba_Funeraria_Facade {

	public static void main(String[] args) {

		Difunto difunto = new Difunto("Difunto1");
		Empleado director = new Director_Funerario("Director1", "AAA");
		Empleado sacerdote = new Sacerdote("Sacerdote1", "SS");
		Empleado embalsamador = new Embalsamador("Embalsamador1", "EE");
		Empleado chofer = new Chofer("Chofer1", "CC");
		Casa_Funeraria casaFuneraria = new Casa_Funeraria("C.F. Angeles S.A. ", director, sacerdote, embalsamador,
				difunto);
		Transporte transporte = new Transporte("Moviles Funerarios LTDA", director, difunto, chofer);
		Cementerio cementerio = new Cementerio("Campos de algun dios", director, sacerdote, difunto);
		
		Funeraria funeraria = new Funeraria(casaFuneraria, transporte, cementerio);
		
		funeraria.velar();
		funeraria.tranportar();
		funeraria.enterrar();

	}

}
