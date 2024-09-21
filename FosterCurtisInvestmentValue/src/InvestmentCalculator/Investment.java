package InvestmentCalculator;

public class Investment {
	private double amount;
	private int years;
	private double rate;
	
	public Investment(){
		this(10000, 3, 3.25);
	}
	
	public Investment(double amount, int years, double rate){
		this.amount = amount;
		this.years = years;
		this.rate = rate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double getMonthlyInvestment() {
		double monthlyRate = rate / 1200;
		double monthlyInvestment = monthlyRate;
		return monthlyInvestment;
	}
	
	public double getTotalInvestment() {
		double totalInvestment = amount * (Math.pow(1 + getMonthlyInvestment(), years * 12));
		return totalInvestment;
		
	}
}
