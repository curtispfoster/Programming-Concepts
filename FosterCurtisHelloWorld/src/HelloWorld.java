import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter card number: ");
		long numbers = input.nextLong();

		String numbersAsString = Long.toString(numbers);

		char[] digits = numbersAsString.toCharArray();

		for (int i = digits.length - 2; i >= 0; i -= 2) {
			int digit = Character.getNumericValue(digits[i]);

			
			//this is also step 2
			if (digit >= 10) {
				digit = digit % 10 + digit / 10;
			}

			digits[i] = Character.forDigit(digit, 10);
		}

		long result = Long.parseLong(new String(digits));

		System.out.println("Input: " + numbers);
		System.out.println("Output: " + result);

	}

}
