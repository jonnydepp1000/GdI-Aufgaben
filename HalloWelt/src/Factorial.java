
public class Factorial {

	public static void main(String[] args) {
		
		// TODO Fakult�t einer beliebigen Ganzzahl berechnen
		
		int n = 5;
		int x;
		int fakult�t = 1;
		for(x = 1; x <= n; ++x) {
			fakult�t = x * fakult�t;
		}
		System.out.print("Fakult�t von " + n + " ergibt: " + fakult�t );
	}

}
