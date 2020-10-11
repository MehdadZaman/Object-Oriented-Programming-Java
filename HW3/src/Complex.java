/* 
 * Name: Mehdad Zaman 
 * Stonybrook ID: 112323211
 */
import java.util.Scanner;
public class Complex 
{
	public static void main(String[]args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter real part of the first complex number: ");
		double real1 = stdin.nextDouble();
		System.out.print("Enter imaginary part of the first complex number: ");
		double imag1 = stdin.nextDouble();
		System.out.print("Enter real part of the second complex number: ");
		double real2 = stdin.nextDouble();
		System.out.print("Enter imaginary part of the second complex number: ");
		double imag2 = stdin.nextDouble();
		Complexc complex_num = new Complexc(real1, imag1, real2, imag2);
		double[] print1 = complex_num.printfirst();
		System.out.println("First complex number is: (" + print1[0] + ", " + print1[1] + ")" );
		double[] print2 = complex_num.printsecond();
		System.out.println("Second complex number is: (" + print2[0] + ", " + print2[1] + ")" );
		double[] compadd = complex_num.addcomp();
		System.out.println("Addition of the complex numbers is: (" + compadd[0] + ", " + compadd[1] + ")" );
		double[] compsub = complex_num.subcomp();
		System.out.println("Addition of the complex numbers is: (" + compsub[0] + ", " + compsub[1] + ")" );
		stdin.close();
	
	}
}
class Complexc{
	private double real1, imag1, real2, imag2;
	private double[] arr = new double[2];
	public Complexc() {}
	public Complexc(double num1_1, double num1_2, double num2_1, double num2_2) 
	{
		real1 = num1_1;
		imag1 = num1_2;
		real2 = num2_1;
		imag2 = num2_2;
	}
	public void setreal1(double real1) {
		this.real1 = real1;
	}
	public void setimag1(double imag1) {
		this.imag1 = imag1;
	}
	public void setreal2(double real2) {
		this.real2 = real2;
	}
	public void setimag2(double imag2) {
		this.imag2 = imag2;
	}
	public double getreal1()
	{
		return this.real1;
	}
	public double getimag1()
	{
		return this.imag1;
	}
	public double getreal2()
	{
		return this.real2;
	}
	public double getimag2()
	{
		return this.imag2;
	}
	public double[] printfirst()
	{
		arr[0] = real1;
		arr[1] = imag1;
		return arr;
	}
	public double[] printsecond()
	{
		arr[0] = real2;
		arr[1] = imag2;
		return arr;
	}
	public double[] addcomp()
	{
		arr[0] = real1 + real2;
		arr[1] = imag1 + imag2;
		return arr;
	}
	public double[] subcomp()
	{
		arr[0] = real1 - real2;
		arr[1] = imag1 - imag2;
		return arr;
	}
}
