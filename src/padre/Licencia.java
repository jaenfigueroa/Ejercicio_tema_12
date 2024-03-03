package padre;

public class Licencia {
	protected String clase, categoria, fechaEmision, fechaRenovacion;

	public Licencia(String clase, String categoria, String fechaEmision, String fechaRenovacion) {
		this.clase = clase;
		this.categoria = categoria;
		this.fechaEmision = fechaEmision;
		this.fechaRenovacion = fechaRenovacion;
	}
	
	public String datosCompletos() {
		String datos = "";
		
		datos += "Clase: " + clase + "\n";
		datos += "Categoria: " + categoria + "\n";
		datos += "Fecha de emisión: " + fechaEmision + "\n";
		datos += "Fecha de renovación: " + fechaRenovacion + "\n";
		
		datos += "Codigo: " + clase + categoria + fechaEmision + fechaRenovacion + "\n";
		
		return datos;
	}
}
