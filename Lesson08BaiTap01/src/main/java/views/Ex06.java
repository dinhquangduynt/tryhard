package views;


public class Ex06 {
	private final static int INDEX = 100;
	
	public static void main(String[] args) {
		System.out.println(numberInTheSequence(INDEX));
	}
	
	private static char numberInTheSequence(int index) {
		
		int count = 1;
		StringBuffer numberStrBB = new StringBuffer();
		while(count <= index) {
			numberStrBB.append(count);
			count++;
		}
		char[] result = numberStrBB.toString().toCharArray();
		for(char r : result) {
			System.out.println(r);
		}
		
		return result[index];
	}

}
