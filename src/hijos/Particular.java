package hijos;

import padre.Licencia;

public class Particular extends Licencia{
	private int dni;

	public Particular(String clase, String categoria, String fechaEmision, String fechaRenovacion, int dni) {
		super(clase, categoria, fechaEmision, fechaRenovacion);

		this.dni = dni;
	}
	
	public String datosCompletos() {
		String datos = "";
		
		datos += super.datosCompletos();
		
		datos += "DNI: " + dni + "\n";
		datos += "Segundo código: " + segundoCodigo() + "\n";
		
		return datos;
	}
	
	public String segundoCodigo() {
		return super.categoria + dni;
	}
}
