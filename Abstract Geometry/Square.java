
public class Square extends GeometricFigure {
	private double area;
	
	public Square(double h, double w, String geo) {
		super(geo, h ,w);
	}
	public double Area(double h, double w)
	{
		area = (h*w);
		return area;
	}

}
