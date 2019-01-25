

/**
 * Clase para trabajar con rectangulos
 * 
 * @author Konstantin Voziyan
 * @version 1.2
 * @since 25/01/2019
 */
public class Rectangulo_KV extends FiguraGeometrica_KV {
	private double l1;
	private double l2;
	
    /**
     * Metodo constructor, recibe 3 parámetros, el tipo de figura y las
     * dos dimensiones.
     * 
     * @param tipoFigura: Tipo de figura, en este caso un rectangulo
     * @param lG: lado 1
     * @param lP: lado 2
     */
    public Rectangulo_KV(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

    /**
     * Modificación del metodo para calcular el area, adaptado a los rectangulos.
     * 
     * @return area: El area del rectangulo
     */
    @Override
	public double area() {
		return l1 * l2;
	}
	
    /**
     * Modificación del metodo para calcular el perimetro, adaptado a los rectangulos.
     * 
     * @return perimetro: El perimetro del rectangulo
     */
    @Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
