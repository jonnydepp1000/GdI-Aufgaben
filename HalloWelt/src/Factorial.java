
public class Factorial {

	public static void main(String[] args) {
		
		// TODO Fakultät einer beliebigen Ganzzahl berechnen
		
		int n = 5;
		int x;
		int fakultät = 1;
		for(x = 1; x <= n; ++x) {
			fakultät = x * fakultät;
		}
		System.out.print("Fakultät von " + n + " ergibt: " + fakultät );
	}

}
