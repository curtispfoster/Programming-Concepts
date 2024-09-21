import java.util.Scanner;

public class ConsecutiveEqualNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number rows: ");
		int numberOfRows = input.nextInt();

		System.out.print("Enter the number columns: ");
		int numberOfColumns = input.nextInt();

		int[][] values = new int[numberOfColumns][numberOfRows];

		for (int row = 0; row < values.length; row++) {
			for (int col = 0; col < values[row].length; col++) {
				System.out.println("Enter a number: ");
				int number = input.nextInt();
				values[row][col] = number;

			}
		}

		if (isConsecutiveFour(values)) {
			System.out.println("Found Four consecutive occuress of ");
		} else {
			System.out.println("Did not find four consecutive occurrences.");
		}

		input.close();
	}

	public static boolean isConsecutiveFour(int[][] values) {
		return isThereFourHorizontal(values) || isThereFourVertical(values) || isThereFourDiagonal(values);
	}

	public static boolean isThereFourHorizontal(int[][] values) {

		for (int row = 0; row < values.length; row++) {
			for (int col = 0; col < values[0].length; col++) {

				int value = values[row][col];
				if (value == values[row][col + 1] && value == values[row][col + 2] && value == values[row][col + 3]) {
					return true;
				} 

			}
		}

		return false;
	}

	public static boolean isThereFourVertical(int[][] values) {
		for (int row = 0; row < values.length; row++) {
			for (int col = 0; col < values[0].length; col++) {

				int value = values[row][col];
				if (value == values[row + 1][col] && value == values[row + 2][col] && value == values[row + 3][col]) {
					return true;

				} 

			}
		}

		return false;
	}

	public static boolean isThereFourDiagonal(int[][] values) {
		return isThereFourDiagonalLtoR(values) || isThereFourDiagonalRtoL(values);
	}

	public static boolean isThereFourDiagonalRtoL(int[][] values) {
		for (int row = 0; row < values.length; row++) {
			for (int col = 0; col < values[0].length - 3; col++) {

				int value = values[row][col];
				if (value == values[row + 1][col - 1] && value == values[row + 2][col - 2]
						&& value == values[row + 3][col - 3]) {
					return true;
				} 

			}
		}

		return false;
	}

	public static boolean isThereFourDiagonalLtoR(int[][] values) {
		for (int row = 0; row < values.length; row++) {
			for (int col = 0; col < values[0].length - 3; col++) {

				int value = values[row][col];
				if (value == values[row + 1][col + 1] && value == values[row + 2][col + 2]
						&& value == values[row + 3][col + 3]) {
					return true;

				}
			}

		}
		return false;
	}
	
}
