
public class maxFactorial {

	public static void main(String[] args) {
		// TODO maximale Fakultät einer beliebigen Zahl errechnen
		int fakultaet = 1;
		int i = 300;
		do {
		int n = 100;
		int x;

		for(x = 1; x <= n; ++x) {
			fakultaet = x * fakultaet;
		}
		
		} while(fakultaet < i);
		System.out.print("Fakultät von " + n + " ergibt: " + fakultaet );
	}

}
