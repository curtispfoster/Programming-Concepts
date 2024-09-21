package InvestmentCalculator;

public class Debugging {

	public static void main(String[] args) {
		
		Investment investment = new Investment();
		
		System.out.println("Investment Amount: " + investment.getAmount());
		System.out.println("Number of years: " + investment.getYears());
		System.out.println("Rate: " + investment.getRate());
		
		System.out.println("Monthly Rate: " + investment.getMonthlyInvestment());
		System.out.println("Total: " + investment.getTotalInvestment());

	}

}
