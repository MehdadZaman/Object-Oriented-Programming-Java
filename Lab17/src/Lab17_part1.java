import java.util.Scanner;
public class Lab17_part1 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the sides of a triangle");
		double side1 = stdin.nextDouble();
		double side2 = stdin.nextDouble();
		double side3 = stdin.nextDouble();
		System.out.println("Enter the color");
		String color = stdin.next();
		System.out.println("Enter true or false for filled");
		boolean filled = stdin.nextBoolean();
		Triangle tri = new Triangle(side1, side2, side3, color, filled);
		System.out.println(tri);
		stdin.close();
	}
}
class Triangle extends GeometricObject {
	private double side1 = 1, side2 = 1, side3 = 1, s;
	public Triangle() {}
	public Triangle(double side1, double side2, double side3, String color, Boolean filled) {
		super(color, filled);
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
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	public String toString() {
		return super.toString() + " Triangle1.side1 = " + this.side1 + " side2 = " + this.side2 + " side3 = " 
	+ this.side3+ " area " + getArea() + " perimeter " + getPerimeter();
	}
}
class GeometricObject {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;
	  public GeometricObject() {
	    dateCreated = new java.util.Date();
	  }
	  public GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }
	  public String getColor() {   return color;  }
	  public void setColor(String color) {  this.color = color;  }
	  public boolean isFilled() {   return filled;  }
	  public void setFilled(boolean filled) {  this.filled = filled;  }
	  public java.util.Date getDateCreated() {   return dateCreated;  }
	  public String toString() {
	    return "created on " + dateCreated + "\ncolor: " + color +
	      " and filled: " + filled;
	  }
	  public static void main(String[] args) {
		  GeometricObject go = new GeometricObject();
		  System.out.println(go);
	  }
	}