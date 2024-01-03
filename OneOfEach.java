public class OneOfEach {

	public static void main(String[] args) {
		int numOfGirls = 0;
		int numOfBoys = 0;

		while (numOfGirls < 1 || numOfBoys < 1) {
			double rnd = Math.random();

			if (rnd <= 0.5) {
				System.out.print(" g ");
				numOfGirls++;

			} else {
				System.out.print(" b ");
				numOfBoys++;
			}
		}

		int numOfChildren = numOfGirls + numOfBoys;

		System.out.println();
		System.out.println("You made it... and you now have " + numOfChildren + " children.");

	}

}
