public class OneOfEachStats1 {
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		int numOfGirls = 0;
		int numOfBoys = 0;
		int numOfChildren = 0;
		int totalOfChildren = 0;
		int familiesTwoChildren = 0;
		int familiesThreeChildren = 0;
		int familiesWithMore = 0;

		for (int i = 0; i < T; i++) {

			while (numOfGirls < 1 || numOfBoys < 1) {

				double rnd = Math.random();
				if (rnd <= 0.5) {
					numOfGirls++;
				} else {
					numOfBoys++;
				}

				numOfChildren = numOfGirls + numOfBoys;
				totalOfChildren += numOfChildren;

				if (numOfChildren == 2) {
					familiesTwoChildren++;
				} else if (numOfChildren == 3) {
					familiesThreeChildren++;
				} else {
					familiesWithMore++;
				}
			}
		}

		double avarage = totalOfChildren / T;
		int max = (Math.max(Math.max(familiesTwoChildren, familiesThreeChildren), (familiesWithMore)));

		System.out.println("Average: " + avarage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familiesTwoChildren);
		System.out.println("Number of families with 3 children: " + familiesThreeChildren);
		System.out.println("Number of families with 4 or more children: " + familiesWithMore);

		if (max == familiesTwoChildren) {
			System.out.println("The most common number of children is 2.");
		} else if (max == familiesThreeChildren) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}

	}

}
