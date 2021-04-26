
public abstract class GeometricFigure {

		double w, h;
		String geo;
		
		public GeometricFigure(String geo, double w, double h) {
			this.geo = geo;
			this.w = w;
			this.h = h;
			}

		public double getWidth() {
			return w;
		}

		public void setWidth(double width) {
			this.w = width;
		}

		public double getHeight() {
			return h;
		}

		public void setHeight(double height) {
			this.h = height;
		}

		public String getType() {
			return geo;
		}

		public void setType(String geo) {
			this.geo = geo;
		}
		public abstract double Area(double height, double width);
		
}
