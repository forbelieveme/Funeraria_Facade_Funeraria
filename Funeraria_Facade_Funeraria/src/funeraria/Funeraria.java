package funeraria;

public class Funeraria {

	Casa_Funeraria casaFuneraria;
	Transporte transporte;
	Cementerio cementerio;

	public Funeraria(Casa_Funeraria casaFuneraria, Transporte transporte, Cementerio cementerio) {
		this.casaFuneraria = casaFuneraria;
		this.transporte = transporte;
		this.cementerio = cementerio;
	}
	
	public void velar() {
		casaFuneraria.embalsamarDifunto();
		casaFuneraria.velarDifunto();
	}
	
	public void tranportar() {
		transporte.transportarCoronas();
		transporte.transportarDifunto();
	}
	
	public void enterrar() {
		cementerio.misaDifunto();
		cementerio.enterrarDifunto();
	}

}
