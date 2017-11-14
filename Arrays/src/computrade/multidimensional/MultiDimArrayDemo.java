package computrade.multidimensional;

public class MultiDimArrayDemo {

	public static void main(String[] args) {

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } };

		// Mr. Smith
		System.out.println(names[0][0] + names[1][0]);
		// Ms. Jones
		System.out.println(names[0][2] + names[1][1]);

		System.out.println("names size:" + names.length);// 2
		System.out.println("names[0] size:" + names[0].length); // 3
		System.out.println("names[1] size:" + names[1].length); // 2

		// printMultiDimArray(names);
		// printMultiDimArrayTwoSteps(names);
		// printMultiDimArraySimple(names);

	}

	public static void printMultiDimArray(String[][] names) {

		System.out.println("***printMultiDimArray***");
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printMultiDimArrayTwoSteps(String[][] names) {

		System.out.println("***printMultiDimArrayTwoSteps***");
		for (int i = 0; i < names.length; i++) {
			printOneDimArray(names[i]);
		}
	}

	public static void printOneDimArray(String[] names) {
		for (int j = 0; j < names.length; j++) {
			System.out.print(names[j] + " ");
		}
		System.out.println();
	}

	public static void printMultiDimArraySimple(String[][] names) {

		System.out.println("***printMultiDimArraySimple***");
		for (String[] x : names) {
			for (String y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
