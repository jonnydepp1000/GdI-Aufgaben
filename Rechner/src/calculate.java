
public class calculate {

	public static void main(String[] args) {
		// ax² + bx + c = 0 --> Nullstellenberechnung
		// Mitternachtsformel:

		double a = 1;
		double b = 4;
		double c = 2;
		double x;
		double x1;
		double x2;

		double d;
		d = Math.pow(b, 2) - 4 * a * c;

		if (d < 0)
			System.out.println("Keine Lösung");
		else if (d == 0) {
			x = (-1 * b) / 2 * a;
			System.out.println("x = " + x);
		} else {
			x1 = ((-1 * b) + d) / 2 * a;
			x2 = ((-1 * b) - d) / 2 * a;
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}

	}

}
