/* 
 * Name: Mehdad Zaman 
 * Stonybrook ID: 112323211
 */
import java.util.Scanner;
public class Rational {
	public static void main(String[] args)
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter numerator for the first rational number: ");
		int numer1 = stdin.nextInt();
		System.out.print("Enter a non-zero denominator for the first rational number: ");
		int denim1 = stdin.nextInt();
		System.out.print("Enter numerator for the second rational number: ");
		int numer2 = stdin.nextInt();
		System.out.print("Enter a non-zero denominator for the second rational number: ");
		int denim2 = stdin.nextInt();
		Rationall oper = new Rationall(numer1, denim1, numer2, denim2);
		System.out.println("First rational number is: " + oper.reduced1());
		System.out.println("Second rational number is: " + oper.reduced2());
		System.out.println("Addition of the rational numbers is: " + oper.fracadd());
		System.out.println("Subtraction of the rational numbers is: " + oper.fracsub());
		System.out.println("Multiplication of the rational numbers is: " + oper.fracmult());
		System.out.println("Division of the rational numbers is: " + oper.fracdiv());
		stdin.close();
	}
}
class Rationall{
	private int numer1, denim1, numer2, denim2;	
	public Rationall() {}
	public Rationall(int n1, int n2, int n3, int n4) {
		numer1 = n1;
		denim1 = n2;
		numer2 = n3;
		denim2 = n4;
	}
	public void setnumer1(int numer1) {
		this.numer1 = numer1;
	}
	public void setimag1(int denim1) {
		this.denim1 = denim1;
	}
	public void setreal2(int numer2) {
		this.numer2 = numer2;
	}
	public void setimag2(int denim2) {
		this.denim2 = denim2;
	}
	public int getnumer1()
	{
		return this.numer1;
	}
	public int getdenim1()
	{
		return this.denim1;
	}
	public int getnumer2()
	{
		return this.numer2;
	}
	public double getdenim2()
	{
		return this.denim2;
	}
	public String reduced1() 
	{
		int gcf1 = 1;
		for(int i = 2; i <= Math.min(numer1, denim1); i++)
		{
			if(numer1 % i == 0 && denim1 % i == 0)
			{
				gcf1 = i;
			}
		}
		int numer1_1 = numer1 / gcf1;
		int denim1_1 = denim1 / gcf1;
		return numer1_1 + "/" + denim1_1;
	}
	public String reduced2() 
	{
		int gcf_2 = 1;
		for(int i = 2; i <= Math.min(numer2, denim2); i++)
		{
			if(numer2 % i == 0 && denim2 % i == 0)
			{
				gcf_2 = i;
			}
		}
		int numer2_1 = numer2 / gcf_2;
		int denim2_1 = denim2 / gcf_2;
		return numer2_1 + "/" + denim2_1;
	}
	public String fracadd() 
	{
		int gcf_3 = 1;
		int i = Math.max(denim1, denim2);
		while(!(i % denim1 == 0 && i % denim2 == 0))
		{
			i++;
		}
		int factor1 = i / denim1;
		int factor2 = i / denim2;
		int numersum = (numer1 * factor1) + (numer2 * factor2);
		for(int l = 2; l <= Math.min(numersum, i); l++)
		{
			if(numersum % l == 0 && i % l == 0)
			{
				gcf_3 = l;
			}
		}
		int numersum_1 = numersum / gcf_3;
		int i_1 = i / gcf_3;
		return numersum_1 + "/" + i_1;
	}
	public String fracsub() 
	{
		int gcf_4 = 1;
		int i = Math.max(denim1, denim2);
		while(!(i % denim1 == 0 && i % denim2 == 0))
		{
			i++;
		}
		int factor1 = i / denim1;
		int factor2 = i / denim2;
		int numerdiff = (numer1 * factor1) - (numer2 * factor2);
		for(int l = 2; l <= Math.min(numerdiff, i); l++)
		{
			if(numerdiff % l == 0 && i % l == 0)
			{
				gcf_4 = l;
			}
		}
		numerdiff = numerdiff / gcf_4;
		i = i / gcf_4;
		return numerdiff + "/" + i;
	}
	public String fracmult() {
		int gcf_5 = 1;
		int numerprod = numer1 * numer2;
		int denimprod = denim1 * denim2;
		for(int l = 2; l <= Math.min(numerprod, denimprod); l++)
		{
			if(numerprod % l == 0 && denimprod % l == 0)
			{
				gcf_5 = l;
			}
		}
		numerprod = numerprod / gcf_5;
		denimprod = denimprod / gcf_5;
		return numerprod + "/" + denimprod;
	}
	public String fracdiv() {
		int gcf_6 = 1;
		int numerprod = numer1 * denim2;
		int denimprod = denim1 * numer2;
		for(int l = 2; l <= Math.min(numerprod, denimprod); l++)
		{
			if(numerprod % l == 0 && denimprod % l == 0)
			{
				gcf_6 = l;
			}
		}
		numerprod = numerprod / gcf_6;
		denimprod = denimprod / gcf_6;
		return numerprod + "/" + denimprod;
	}
}