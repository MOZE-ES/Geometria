
public abstract class FiguraGeometrica_MO {
	
	public double semiPerimetro() {
		return this.perimetro() / 2;
	}

	protected String tipoFigura;

	public FiguraGeometrica_MO(String tipoFigura) {
		super();
		this.tipoFigura = tipoFigura;
	}

	public abstract double area();
	
	public abstract double perimetro();

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

}
