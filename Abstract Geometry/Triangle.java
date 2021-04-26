
public class Triangle extends GeometricFigure {
private double area;
	
	public Triangle(double h, double w, String geo) 
	{
		super(geo, h, w);
	}
	public double Area(double h, double w)
	{
		area = ((h*w)/2);
		return area;
	}

}