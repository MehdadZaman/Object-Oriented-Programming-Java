public class Lab23_part2 {
	public static void main(String[] args)
	{
		GeometricObject[] geom = new GeometricObject[4];
		geom[3] = new Circle();
		geom[1] = new Rectangle();
		geom[2] = new Square();
		geom[0] = new Square();
		for(int i = 0; i < geom.length; i++)
		{
			if(geom[i] instanceof Square) 
			{
				((Square)geom[i]).howToColor();
				System.out.println(geom[i].getArea());
			}
			else if(geom[i] instanceof Circle)
			{
				System.out.println(geom[i].getArea());
			}
			else
			{
				((Rectangle)geom[i]).howToColor();
				System.out.println(geom[i].getArea());
			}	
		}
	}
}

interface Colorable{
	void howToColor();
}

class Square extends GeometricObject implements Colorable{
	private double side;
	public Square() {
	}
	public Square(double side) {
		this.side = side;
	}
	public double getSide() {
		return this.side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public double getArea() {
		return this.side * this.side; 
	}
	public double getPerimeter()
	{
		return this.side * 4;
	}
	public void howToColor() {
		System.out.println("Color all four sides");
	}
}
class Rectangle extends GeometricObject implements Colorable {
	  private double width;
	  private double height;
	  public Rectangle() {  }
	  public Rectangle(double width, double height) {
	    this.width = width;
	    this.height = height;
	  }
	  public double getWidth() {    return width;  }
	  public void setWidth(double width) {     this.width = width;  }
	  public double getHeight() {    return height;  }
	  public void setHeight(double height) {    this.height = height;  }
	  
	  public double getArea() {
	    return width * height;
	  }

	  public double getPerimeter() {
	    return 2 * (width + height);
	  }
	  public void howToColor() {
		  System.out.println("Color the shorter sides and then the longer sides");
	  }
}