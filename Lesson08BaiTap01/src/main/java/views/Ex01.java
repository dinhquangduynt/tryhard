package views;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String input = input();
		showCharacter(input);
		showWord(input);
		showStringReverse(input);
	}

	private static String input() {
		Scanner input = new Scanner(System.in);
		System.out.println("nhập vào chuỗi: ");
		String string;

		do {
			string = input.nextLine().trim();
			if (!isValid(string)) {
				System.out.println("Vui lòng nhập lại chuỗi: ");
			}
		} while (!isValid(string));
		return string;
	}
	
	private static void showCharacter(String input) {
		System.out.println("Hiển thị mỗi ký tự trên 1 dòng");
		for(char element : input.toCharArray()){
			System.out.println(element);
		}
	}
	
	private static void showWord(String input) {
		System.out.println("Hiển thị mỗi từ trên mỗi dòng");
		String[] strings = input.split(" ");
		for(String word : strings) {
			System.out.println(word);
		}
	}
	
	private static void showStringReverse(String input) {
		System.out.println("Hiển thị chuỗi đảo ngược");
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i) + " ");
		}
	}

	private static boolean isValid(String string) {

		return string.matches("[^0-9!@#$%^&*]+");
	}

}
