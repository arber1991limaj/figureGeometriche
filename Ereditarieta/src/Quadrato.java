
public class Quadrato extends FiguraGeometrica{
	private int lato;
	
	public Quadrato(int lato) {
		super();
		this.lato = lato;
	}

	public double getArea(){
		return lato*lato;
	}
}
