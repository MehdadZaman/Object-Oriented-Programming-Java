/*
 Name: Mehdad Zaman
 SBU ID: 112323211
 */
public class Problem1 {
	public static void main(String[] args)
	{
		GeometricObject rectangle1 = new Rectangle("green", true, 1, 1);
		GeometricObject rectangle2 = new Rectangle("blue", false, 2, 2);
		GeometricObject circle1 = new Circle("green", true, 1);
		GeometricObject circle2 = new Circle("blue", false, 2);
		System.out.println(GeometricObject.getmax(rectangle1, rectangle2));
		System.out.println(GeometricObject.getmax(circle1, circle2));
	}
}
abstract class GeometricObject implements Comparable<GeometricObject> {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }
	  protected GeometricObject(String color, boolean filled) {
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
		public int compareTo(GeometricObject geo)
		{
			if(this.getArea() - geo.getArea() > 0)
			{
				return 1;
			}
			else if(this.getArea() - geo.getArea() == 0)
			{
				return 0;
			}
			else
			{
				return -1;
			}
		}
		public static GeometricObject getmax(GeometricObject firstgeom, GeometricObject secondgeom) {
			if(firstgeom.compareTo(secondgeom) > 0)
			{
				return firstgeom;
			}
			else
			{
				return secondgeom;
			}
		}
	  /** Abstract method getArea */
	  public abstract double getArea();
	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();
	}
class Circle extends GeometricObject
{
	private double radius;
	public Circle() {
		this("black", false, 1);
	}
	public Circle(String color, boolean filled, double radius)
	{
		super(color, filled);
		this.radius = radius;
	}
	public void setRadius(double radius) {this.radius = radius;}
	public double getRadius() {return this.radius;}
	public double getArea() {return Math.PI * (Math.pow(this.radius, 2));}
	public double getPerimeter() {
		return ((this.radius * 2) * Math.PI);
	}
	public String toString() {
	    return super.toString() + "; radius: " + this.radius + ", perimeter: " 
	+ this.getPerimeter() + ", area: " + this.getArea();
	  }
}
class Rectangle extends  GeometricObject{
	private double width, height;
	public Rectangle() {
		this("black", false, 1, 1);
	}
	public Rectangle(String color, boolean filled, double width, double height)
	{
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	public void setwidth(double width) {this.width = width;}
	public double getwidth() {return this.width;}
	public void setheight(double height) {this.height = height;}
	public double getheight() {return this.height;}	
	public double getArea() {return this.width * this.height;}
	public double getPerimeter() {
		return (this.width * 2) + (this.height * 2);
	}
	public String toString() {
	    return super.toString() + "; height: " + this.height + ", width: " + this.width 
	    		+ ", perimeter: " + this.getPerimeter() + ", area: " + this.getArea();
	  }
}	