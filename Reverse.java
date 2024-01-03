public class Reverse {
	public static void main(String[] args) {
		String str = args[0];
		int num = str.length() - 1;
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str.charAt(num));
			num -= 1;
		}
		System.out.println();

		if (str.length() % 2 == 1) {
			System.out.println("The middle character is " + (str.charAt((str.length() / 2))));
		} else {
			System.out.println("The middle character is " + (str.charAt((str.length() / 2) - 1)));
		}

	}

}
