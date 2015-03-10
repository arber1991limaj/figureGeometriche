
public class Triangolo extends FiguraGeometrica{
	private int altezza;
	private int base;
	public Triangolo(int base, int altezza){
		this.altezza=altezza;
		this.base=base;
	}
	
	public double getArea(){
		return (base*altezza)/2;
	}
}
