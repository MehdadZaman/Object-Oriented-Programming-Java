import java.util.Scanner;
public class Lab16_part2 {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = stdin.nextDouble();
		double b = stdin.nextDouble();
		double c = stdin.nextDouble();
		double d = stdin.nextDouble();
		double e = stdin.nextDouble();
		double f = stdin.nextDouble();
		LinearEquation userinp = new LinearEquation(a, b, c, d, e, f);
		if(userinp.isSolvable() == true)
		{
			System.out.println("X is " + userinp.getX() + " and y is " + userinp.getY());
		}
		else
		{
			System.out.println("The equation has no solutions.");
		}
		stdin.close();
	}
}

class  LinearEquation{
	private double a,b,c,d,e,f;
	public LinearEquation() {}
	public LinearEquation(double a, double b, double c, double d, double e, double f) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		
	}
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	public double getc() {
		return c;
	}
	public double getd() {
		return d;
	}
	public double gete() {
		return e;
	}
	public double getf() {
		return f;
	}
	public boolean isSolvable() {
		if(((a * d) - ( b * c)) == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public double getX()
	{
		return (((e * d) - (b * f)) / ((a * d) - ( b * c)));
	}
	public double getY()
	{
		return (((a * f) - (e * c)) / ((a * d) - ( b * c)));
	}
}