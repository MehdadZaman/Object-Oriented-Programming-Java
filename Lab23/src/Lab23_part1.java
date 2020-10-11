public class Lab23_part1 {
	public static void main(String[] args)
	{
		ComparableCircle circ1 = new ComparableCircle(2);
		ComparableCircle circ2 = new ComparableCircle(1);
		int comp = circ1.compareTo(circ2);
		if(comp > 0)
			System.out.println("Circle 1 is greater than circle 2");
		else if(comp == 0)
			System.out.println("Circle 1 is the same size as circle 2");
		else
			System.out.println("Circle 1 is smaller than circle 2");
	}
}
abstract class GeometricObject {
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
	  /** Abstract method getArea */
	  public abstract double getArea();
	  /** Abstract method getPerimeter */
	  public abstract double getPerimeter();
	}
class Circle extends GeometricObject {
	  private double radius;
	  public Circle() {   }
	  public Circle(double radius) {
	    this.radius = radius;  
	  }
	  public double getRadius() {
	    return radius;
	  }
	  public void setRadius(double radius) {
	    this.radius = radius;  
	  }
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }
	  public double getDiameter() {
	    return 2 * radius;
	  }
	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }
	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }
	}

class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	public int compareTo(ComparableCircle circ) {
		if(this.getArea() > circ.getArea()) {
			return 1;
		}
		else if(this.getArea() == circ.getArea()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}