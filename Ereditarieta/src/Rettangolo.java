
public class Rettangolo extends FiguraGeometrica{
	private int altezza;
	private int base;
	public Rettangolo(int base, int altezza){
		this.altezza=altezza;
		this.base=base;
	}
	
	public double getArea(){
		return base*altezza;
	}
}
