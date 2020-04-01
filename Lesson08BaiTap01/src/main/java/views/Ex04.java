package views;

import java.util.Scanner;

public class Ex04 {
	private static final long MAX_VALUE = 300000000000000000L;

	public static void main(String[] args) {

		System.out.print("Nhập số thứ nhất: ");
		String numberOne = inputNumber();
		System.out.print("Nhập số thứ hai: ");
		String numberTwo = inputNumber();
		String resultFactorOfNumberOne = factorAnalysis(numberOne);
		String resultFactorOfNumberTwo = factorAnalysis(numberTwo);

		System.out.println(resultFactorOfNumberOne.equals(resultFactorOfNumberTwo) ? "YES" : "NO");
	}

	private static String inputNumber() {
		Scanner input = new Scanner(System.in);
		String numberString;
		do {
			numberString = input.nextLine();
			if (!isValidNumber(numberString)) {
				System.out.print("Vui lòng nhập lại số (2 <= n <= 300000000000000000): ");
			}

		} while (!isValidNumber(numberString));
		return numberString;
	}

	private static String factorAnalysis(String numberString) {

		int lengthOfNumber = numberString.length();
		long number = Long.parseLong(numberString);
		StringBuilder numberStringBB = new StringBuilder(lengthOfNumber);

		for (int i = 2; i <= number; i++) {
			int count = 0;
			while (number % i == 0) {
				count++;
				number /= i;
			}
			if (count > 0) {
				numberStringBB.append(i);
			}
		}

		return numberStringBB.toString();
	}

	private static boolean isValidNumber(String numberString) {

		for (int i = 0; i < numberString.length(); i++) {
			if (!Character.isDigit(numberString.charAt(i))) {
				return false;
			}
		}

		return (Long.parseLong(numberString) >= 2 && Long.parseLong(numberString) <= MAX_VALUE) ? true : false;
	}
}
