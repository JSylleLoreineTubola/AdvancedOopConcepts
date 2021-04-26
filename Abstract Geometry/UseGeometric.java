
public class UseGeometric {

	public static void main (String[] args) {
		
		double h,w,a;
		String f;
		
		GeometricFigure[] geo = new GeometricFigure[5];
		geo[0] = new Square(2,5, " Square \n");
		geo[1] = new Square(1,3, "\n Square \n");
		geo[2] = new Triangle(4,8, "\n Triangle \n");
		geo[3] = new Triangle(5,9, "\n Triangle \n");
		geo[4] = new Square(6,7, "\n Square \n");
		
		for(int i = 0; i <geo.length; i++)
		{
			h = geo[i].getHeight();
			w = geo[i].getWidth();
			f = geo[i].getType();
			a = geo[i].Area(h, w);
			System.out.println( f + "Height: " + h + "\nWidth: " + w + "\nArea: " + a);
			
		}
	}
}
