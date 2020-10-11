public class Problem2 {
	public static void main(String[] args)
	{
		Shape[]  arrayofshapes = {new Circle(), new Square(), new Triangle(), new Sphere(), new Cube(), new Tetrahedron()};
		for(int i = 0; i < arrayofshapes.length; i++)
		{
			System.out.println(arrayofshapes[i]);
			if(arrayofshapes[i] instanceof TwoDimensionalShape)
			{
				System.out.println("area: " + ((TwoDimensionalShape)arrayofshapes[i]).getArea());
			}
			else
			{
				System.out.println("area: " + ((ThreeDimensionalShape)arrayofshapes[i]).getArea() + " volume: " 
			+ ((ThreeDimensionalShape)arrayofshapes[i]).getVolume());
			}
		}
	}
}
class Shape{
	public Shape(){
	}
}
class TwoDimensionalShape extends Shape{
	public TwoDimensionalShape() {
	}
	public double getArea() {return 0;}
}
class Circle extends TwoDimensionalShape
{
	private double radius;
	public Circle() {
		this(1);
	}
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return this.radius;}
	public double getArea() {return Math.PI *(Math.pow(this.radius, 2));}
	public String toString() {
		return "Circle";
	}
}
class Square extends TwoDimensionalShape{
	private double sidelength;
	public Square() {
		this(1);
	}
	public Square(double sidelength)
	{
		this.sidelength = sidelength;
	}
	public void setsidelength(double sidelength) {this.sidelength = sidelength;}
	public double getsidelength() {return this.sidelength;}
	public double getArea() {return (Math.pow(this.sidelength, 2));}
	public String toString() {
		return "Square";
	}	
}
class Triangle extends TwoDimensionalShape{
	private double side1, side2, side3,s;
	public Triangle() {
		this(1, 1, 1);
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getside1() {
		return side1;
	}
	public void setside1(double side1)
	{
		this.side1 = side1;
	}
	public double getside2() {
		return side2;
	}
	public void setside2(double side2)
	{
		this.side2 = side2;
	}
	public double getside3() {
		return side3;
	}
	public void setside3(double side3)
	{
		this.side3 = side3;
	}
	public double getArea() {
		this.s = (this.side1 + this.side2 + this.side3) / 2;
		return Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
	}
	public String toString() {
		return "Triangle";
	}
}
class ThreeDimensionalShape extends Shape{
	public ThreeDimensionalShape() {}
	public double getArea() {return 0;}
	public double getVolume() {return 0;}
}
class Sphere extends ThreeDimensionalShape{
	private double radius;
	public Sphere() {
		this(1);
	}
	public Sphere(double radius) {
		this.radius = radius;
	}
	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return this.radius;}
	
	public double getArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	public double getVolume() {
		return ((4/3.0) * Math.PI * Math.pow(this.radius, 3));
	}
	public String toString() {
		return "Sphere";
	}
}
class Cube extends ThreeDimensionalShape{
	private double sidelength;
	public Cube() {
		this(1);
	}
	public Cube(double sidelength)
	{
		this.sidelength = sidelength;
	}
	public void setsidelength(double sidelength) {this.sidelength = sidelength;}
	public double getsidelength() {return this.sidelength;}
	public double getArea() {return 6 * Math.pow(this.sidelength, 2);}
	public double getVolume() {return (Math.pow(this.sidelength, 3));}
	public String toString() {
		return "Cube";
	}
}
class Tetrahedron extends ThreeDimensionalShape{
	private double edgelength;
	public Tetrahedron() {
		this(1);
	}
	public Tetrahedron(double edgelength){
		this.edgelength = edgelength;	
	}
	public void setedgelength(double edgelength) {this.edgelength = edgelength;}
	public double getedgelength() {return this.edgelength;}
	public double getArea() {
		return Math.pow(3, 0.5) * Math.pow(edgelength, 2);
	}
	public double getVolume() {
		return Math.pow(edgelength, 3) / (6 * Math.pow(2, 0.5));
	}
	public String toString() {
		return "Tetrahedron";
	}
}