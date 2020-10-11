
public class Lab15_part1 {
	public static void main(String[] args)
	{
		Stock ORCL = new Stock("Oracle Corporation", "ORCL", 34.35, 34.5);
		double price_change = ORCL.getChangePercent();
		System.out.println(price_change + "%");
	}
	

}

class Stock{
	private String symbol, stock_name;
	private double  previousClosingPrice, currentPrice;
	public Stock() {}
	public Stock(String stock_n, String sym, double begin, double end)
	{
		stock_name = stock_n;
		symbol = sym;
		currentPrice = begin;
		previousClosingPrice = end;
		
	}
	double getChangePercent() {
		return (((currentPrice - previousClosingPrice) / previousClosingPrice) * 100);
	}
	
}