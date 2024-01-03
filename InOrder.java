public class InOrder {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		System.out.print(num1 + " ");

		do {

			if (num2 >= num1) {
				System.out.print(num2 + " ");
				num1 = num2;
				num2 = (int) (Math.random() * 10);
			}

		} while (num2 >= num1);

	}
}
