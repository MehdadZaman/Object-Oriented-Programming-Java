public class Lab13_part1{

	public static void main(String[] args)
	{
		Rectangle rect1 = new Rectangle(4, 40);
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.println(" " + rect1.width + " " + rect1.height + " " + rect1.getArea() + " " + rect1.getPerimeter());
		System.out.println(" " + rect2.width + " " + rect2.height + " " + rect2.getArea() + " " + rect2.getPerimeter());

	}

}

class Rectangle 
{
		double width = 1;
		double height = 1;
		Rectangle(){
		}
		Rectangle(double user_width, double user_height)
		{
			width = user_width;
			height = user_height;
		}
		double getArea(){
			return width * height;
		}
		double getPerimeter(){
			return (2 * width) + (2 * height);
		}
}