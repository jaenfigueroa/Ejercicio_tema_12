package hijos;

import padre.Licencia;

public class Profesional extends Licencia{
	private String ruc;

	public Profesional(String clase, String categoria, String fechaEmision, String fechaRenovacion, String ruc) {
		super(clase, categoria, fechaEmision, fechaRenovacion);
		this.ruc = ruc;
	}
	
	public String datosCompletos() {
		String datos = "";
		
		datos += super.datosCompletos();
		
		datos += "RUC: " + ruc + "\n";
		datos += "Segundo código: " + segundoCodigo() + "\n";
		
		return datos;
	}
	
	public String segundoCodigo() {
		return super.categoria + ruc;
	}
}
