package views;

import java.util.Scanner;

public class Ex03 {

	private static final char[] ACCENTED_VIETNAMESE = { 'À', 'Á', 'Â', 'Ã', 'Ă', 'Ạ', 'Ả', 'Ấ', 'Ầ', 'Ẩ', 'Ẫ', 'Ậ', 'Ắ',
			'Ằ', 'Ẳ', 'Ẵ', 'Ặ', 'È', 'É', 'Ê', 'Ẹ', 'Ẻ', 'Ẽ', 'Ế', 'Ề', 'Ể', 'Ễ', 'Ệ', 'Ì', 'Í', 'Ỉ', 'Ị', 'Ĩ', 'Ò',
			'Ó', 'Ô', 'Õ', 'Ơ', 'Ọ', 'Ỏ', 'Ố', 'Ồ', 'Ổ', 'Ỗ', 'Ộ', 'Ớ', 'Ờ', 'Ở', 'Ỡ', 'Ợ', 'Ù', 'Ú', 'Ũ', 'Ư', 'Ụ',
			'Ủ', 'Ứ', 'Ừ', 'Ử', 'Ữ', 'Ự', 'Ý', 'Đ' };

	private static final char[] VIETNAMESE_WITHOUT_ACCENTS = { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A',
			'A', 'A', 'A', 'A', 'A', 'A', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'E', 'I', 'I', 'I', 'I',
			'I', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'U', 'U', 'U',
			'U', 'U', 'U', 'U', 'U', 'U', 'U', 'U', 'Y', 'D', };

	public static void main(String[] args) {
		String input = input();
		removeAccent(input);

	}

	private static String input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi: ");
		String string;

		do {
			string = input.nextLine().trim();
			if (!isValidInputString(string)) {
				System.out.println("Chuỗi không hợp lệ, Nhập lại chuỗi: ");
			}

		} while (!isValidInputString(string));

		return string;
	}

	private static void removeAccent(String input) {

		for (char characterOfInputString : input.toCharArray()) {
			int index = 0;
			String temp = "";
			for (char characterOfAccentedVietNamese : ACCENTED_VIETNAMESE) {

				if (characterOfInputString == characterOfAccentedVietNamese) {
					temp = Character.toString(VIETNAMESE_WITHOUT_ACCENTS[index]);

				} else if ((Character.toString(characterOfInputString)
						.equals(Character.toString(characterOfAccentedVietNamese).toLowerCase()))) {
					temp = Character.toString(VIETNAMESE_WITHOUT_ACCENTS[index]).toLowerCase();

				} else {
					temp = Character.toString(characterOfInputString);
				}

				input = input.replaceAll(Character.toString(characterOfInputString), temp);
				index++;
			}
		}

		System.out.println("Chuỗi sau khi đổi: " + input);
	}

	private static boolean isValidInputString(String input) {
		return input.matches("[^0-9!@#$%^&*]+");
	}

}
