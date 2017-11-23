public class UglyUgly {

	public static int f(int a) {
		a *= 2;
		for (int i = 0; i < 2; i++) {
			a /= 3;
		}
		if (a % 2 == 0) {
			a += 7;
		} else if (a % 3 == 0) {
			for (int j = 0; j < 4; j++) {
				a = a + 1;
			}
		}
		return a;
	}

	public static void main(String[] args) {
		if (f(42) == 13) {
			System.out.println("Richtig!!!");
		} else {
			System.out.println("Falsch!!!");
		}
	}

}