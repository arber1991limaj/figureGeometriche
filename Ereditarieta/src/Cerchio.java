
public class Cerchio extends FiguraGeometrica{
	private int raggio;
	public Cerchio(int raggio){
		this.raggio=raggio;
	}
	public double getArea(){
		return raggio*raggio*3.14;
	}
}
