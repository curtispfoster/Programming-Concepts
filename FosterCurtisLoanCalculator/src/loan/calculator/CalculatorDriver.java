package loan.calculator;
/**

Tested output for the loop for floating point errors
Tested the conversion: double testConvert = returnDouble * 2;

System.out.println(testConvert);

Started using the debug instead of print statements
and hard coded years to 5 and amount to 10,000
			
**/

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculatorDriver {
	
	public static void main(String[] args) {
	//Declare Scanner Object
	Scanner input = new Scanner(System.in);
	
	//Prompt user for loan amount and Declare Big Decimal Object.
	System.out.println("Loan Amount: ");
	BigDecimal amount = new BigDecimal(input.nextInt());
	
	//Prompt user for number of years
	System.out.println("Number of Years: ");
	int years = input.nextInt();
	
	//Display labeling
	System.out.println("Interest Rate   Monthly Payment  Total Payment");
	
	for(double ratePer = 5.0; ratePer <= 8.0; ratePer += .125) {
		
		//Create big decimal object and set decimal point
		BigDecimal rateBDeci = new BigDecimal(ratePer / 100), 
				   rateRndBD = rateBDeci.setScale(5,RoundingMode.HALF_UP);
		
		//Calculate monthly rate, monthly amount, total amount
		BigDecimal monthlyPayBD = rateRndBD.divide(BigDecimal.valueOf(12),10, RoundingMode.HALF_UP),
				
				   numerBD = monthlyPayBD.multiply(BigDecimal.ONE.add(monthlyPayBD).pow(years  * 12)),
				   domerBD = BigDecimal.ONE.add(monthlyPayBD).pow(years * 12).subtract(BigDecimal.ONE),
				   
				   monthlyAmountBD = amount.multiply(numerBD.divide(domerBD, 10, RoundingMode.HALF_UP)),
				   totalAmountBD = monthlyAmountBD.multiply(BigDecimal.valueOf(years * 12));
		
		//Display result
		System.out.printf("%.3f%%\t\t$%.2f\t\t %.2f%n", ratePer, monthlyAmountBD, totalAmountBD);
				
	}
	
	input.close();

}
}
