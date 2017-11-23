
public class HelloGdI {

	public static void main(String[] args) {
		System.out.println("Hello GdI!");
		double myNumber = 40;
		int yourNumber = 25;
		int sum;
		sum = (int) myNumber + yourNumber;
		System.out.println(sum);

		final int test;
		test = -5 * ((sum / 2) % 2 + 1) * (((sum / 2) % 2) * 2 - 1);

		/*
		 * 
		 * ((sum / 2) % 2 + 1) --> ergibt je nach Rest (%) 1 oder 2 
		 * (((sum / 2) % 2) * 2 - 1) --> ergibt je nach Rest -1 oder 1 
		 * 
		 * (-5) * 1 * (-1) = 5 --> Für den Fall (sum / 2) ist eine gerade Zahl
		 * (-5) * 2 * (1) = -10 --> Für den Fall (sum / 2) ist eine ungerade Zahl
		 * 
		 */

		System.out.println(test);
		
		float catalan = (float) 0.91596;
		System.out.println("The Catalan Constant is " + catalan);

	}

}
