package lab_10;
public class Stock {
	private String Symbol;
	private String Name;
	private double closingPrice;
	private double currentPrice;
	
	Stock(String Name, String Symbol) {
		this.Name = Name;
		this.Symbol = Symbol;
	}
	private String getName() {
		return Name;
	}
	private String getSymbol() {
		return Symbol;
	}
	private void setClosingPrice(double price) {
		closingPrice = price;
	}
	private void setCurrentPrice(double price) {
		currentPrice = price;
	}
	private double getChangePercent() {
		double pChange = (currentPrice - closingPrice) / currentPrice * 100;
		return pChange;
	}
	public String toString() {
		String Description = Name + " stock's closing price is $" + currentPrice;
		return Description;
	}
	public static void main(String[] args) {
		Stock google = new Stock("Google", "GOG");
		Stock microsoft = new Stock("Microsoft", "MSF");
		google.setClosingPrice(134.67);
		google.setCurrentPrice(131.98);
		System.out.println();
		System.out.println(google.getName() + " stock:");
		System.out.println("	Sysmbol:	" + google.getSymbol());
		System.out.println("	Closing price:	" + google.closingPrice);
		System.out.println("	Current price:	" + google.currentPrice);
		System.out.println("	Change percent:	" + (int)Math.round(google.getChangePercent()) + "%");
		System.out.println("	" + google.toString());
		System.out.println();
		microsoft.setClosingPrice(156.52);
		microsoft.setCurrentPrice(161.22);
		System.out.println();
		System.out.println(microsoft.getName() + " stock:");
		System.out.println("	Sysmbol:	" + microsoft.getSymbol());
		System.out.println("	Closing price:	" + microsoft.closingPrice);
		System.out.println("	Current price:	" + microsoft.currentPrice);
		System.out.println("	Change percent:	" + (int)Math.round(microsoft.getChangePercent()) + "%");
		System.out.println("	" + microsoft.toString());
		System.out.println();
	}

}
