import java.util.Scanner;

public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		long creditCardNumber = scanner.nextLong();

		if (isValid(creditCardNumber)) {
			System.out.println("The credit card number is valid.");
		} else {
			System.out.println("The credit card number is invalid.");
		}

		scanner.close();
	}

	public static boolean isValid(long number) {
		
		//This is for prefix
		int prefix1 = (int) prefixDigit(number, 1);
		int prefix2 = (int) prefixDigit(number, 2);

		int totalDigits = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
		return (totalDigits % 10 == 0) && (prefix1 == 4) || (prefix1 == 5) || (prefix1 == 6) || (prefix2 == 37);
	}

	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String numberStr = Long.toString(number);
		for (int i = numberStr.length() - 2; i >= 0; i -= 2) {
			int digit = Character.getNumericValue(numberStr.charAt(i));
			sum += singleDigits(digit * 2);
		}

		return sum;
	}

	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String numberStr = Long.toString(number);
		for (int i = numberStr.length() - 2; i >= 0; i -= 2) {
			sum += Character.getNumericValue(numberStr.charAt(i));
		}
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		return prefixDigit(number, sizeOfNumbers(number)) == d;
	}

	public static int singleDigits(int number) {
		if (number < 10) {
			return number;
		} else {
			return number % 10 + number / 10;
		}
	}

	public static int sizeOfNumbers(long d) {
		String numberStr = Long.toString(d);
		return numberStr.length();
	}

	public static long prefixDigit(long number, int p) {
		if (sizeOfNumbers(number) < p) {
			return number;
		} else {
			String numberStr = Long.toString(number);
			return Long.parseLong(numberStr.substring(0, p));
		}
	}
}



