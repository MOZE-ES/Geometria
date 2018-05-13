/**
 * 
 * @author Mindaugas Ozeraitis
 * @version 1.1
 *
 */
public class Rectangulo_MO extends FiguraGeometrica_MO {
	private double l1;
	private double l2;
	/**
	 */
	public Rectangulo_MO(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	@Override
	/**
	 *  Este metodo calcula el area de la figura
	 */
	public double area() {
		return l1 * l2;
	}
	
	@Override
	/**
	 *  Este metodo calcula el perimetro de la figura
	 */
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
