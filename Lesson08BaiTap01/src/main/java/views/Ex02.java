package views;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		String inputString = input();
		System.out.println(operate(inputString));

	}

	private static String input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi: ");
		String string;

		do {
			string = input.nextLine().trim();
			if (!isValidFullName(string)) {
				System.out.println("Chuỗi không hợp lệ, Nhập lại chuỗi: ");
			}

		} while (!isValidFullName(string));

		return string;
	}

	private static String operate(String input) {
		input = input.replaceAll("[\\s]+", " ").toLowerCase();
		StringBuffer inputBuffer = new StringBuffer();
		char[] elementsOfInput = input.toCharArray();

		for (int i = 0; i < elementsOfInput.length; i++) {
			if (i == 0) {
				elementsOfInput[i] = (char) (elementsOfInput[i] - 32);
			}
			if (elementsOfInput[i] == ' ') {
				elementsOfInput[i + 1] = (char) (elementsOfInput[i + 1] - 32);
			}

			inputBuffer.append(elementsOfInput[i]);
		}
		return inputBuffer.toString();
	}

	private static boolean isValidFullName(String input) {
		return input.matches("[A-Za-z\\s]+");
	}

}
