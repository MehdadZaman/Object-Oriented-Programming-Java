
public class Lab15_part2 {

	public static void main(String[] args) {
		RegularPolygon poly1 = new RegularPolygon();
		RegularPolygon poly2 = new  RegularPolygon(6, 4);
		RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("polygon 1 perimeter: " + poly1.getPerimeter() + "; area: " + poly1.getArea());
		System.out.println("polygon 2 perimeter: " + poly2.getPerimeter() + "; area: " + poly2.getArea());
		System.out.println("polygon 3 perimeter: " + poly3.getPerimeter() + "; area: " + poly3.getArea());
	}
		
}

class  RegularPolygon{
	private int n = 3;
	private double side = 1;
	private double x;
	private double y;
	public RegularPolygon() {}
	public RegularPolygon(int num_sides, double len)
	{
		n = num_sides;
		side = len;
	}
	public RegularPolygon(int num_sides, int len, double xcord, double ycord)
	{
		n = num_sides;
		side = len;
		x = xcord;
		y = ycord;
	}
	public int get_n() {
		return n;
	}
	public void set_n(int n_inp) {
		 n = n_inp;
	}
	public double get_side() {
		return side;
	}
	public void set_n(double side_inp) {
		 side = side_inp;
	}
	public double get_x() {
		return x;
	}
	public void set_x(double x_inp) {
		 x = x_inp;
	}
	public double get_y() {
		return y;
	}
	public void set_y(double y_inp) {
		 y = y_inp;
	}
	public double getPerimeter() {
		return (n * side);
	}
	public double getArea() {
		return ((n * (side * side)) / (4 * (Math.tan(Math.PI/n))));
	}
	
}