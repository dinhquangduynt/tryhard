package views;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String stringOne = input();
		String stringTwo = input();
		showLongestSubstring(stringOne, stringTwo);
	}

	private static String input() {
		Scanner input = new Scanner(System.in);
		System.out.println("nhập vào chuỗi: ");
		String string;

		do {
			string = input.nextLine().trim();
			if (!isValidInput(string)) {
				System.out.println("Vui lòng nhập lại chuỗi: ");
			}
		} while (!isValidInput(string));
		return string;
	}

	private static String searchLongestSubstring(String stringOne, String stringTwo) {

		int length = (stringOne.length() <= stringTwo.length()) ? stringOne.length() : stringTwo.length();
		StringBuilder substringBuilder = new StringBuilder();

		for (int i = 0; i < length; i++) {
			if (stringOne.charAt(i) == stringTwo.charAt(i)) {
				substringBuilder.append(stringOne.charAt(i));
			} else {
				substringBuilder.append("-");
			}
		}

		return substringBuilder.toString();
	}

	private static void showLongestSubstring(String stringOne, String stringTwo) {
		String[] substrings = searchLongestSubstring(stringOne, stringTwo).split("[-]+");
		int max = substrings[0].length();
		int index = 0;
		for (int i = 0; i < substrings.length; i++) {
			if (substrings[i].length() > max) {
				index = i;
				max = substrings[i].length();
			}
		}

		System.out.println("Chuỗi con dài nhất trong 2 chuỗi: " + substrings[index]);
	}

	private static boolean isValidInput(String string) {

		return string.matches("[A-Z]{1,250}");
	}

}
