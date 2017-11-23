public class Mathematik {
	// TODO: Methode add() implementieren
	public static int add(int a, int b) {
		return(a + b);
	}
	// TODO: Methode mul() implementieren
	public static int mul(int c, int d) {
		int produkt = 0;
		for(int i = 0; i < d; i++) {
		produkt = add(c, c);
		}
		return(produkt);
	}
	/*
	// TODO: Methode pow() implementieren
	public static double pow(double e, double f) {
		
	}
	*/
	
	public static void main(String[] args) {
		 //TODO: add-Methode implementieren und testen
		  for (int i = 0; i < 5; i++) {
		  	for (int j = 0; j < 5; j++) {
		  		System.out.println("Die Summe von " + i + " und " + j + " ist " + add(i, j));
		  	}
		  }
		 

		// TODO: mul-Methode implementieren und testen
		  for (int i = 0; i < 5; i++) {
		  	for (int j = 0; j < 5; j++) {
		  		System.out.println("Das Produkt von " + i + " und " + j + " ist " + mul(i, j));
		  	}
		  }
		 

		/* TODO: pow-Methode implementieren und testen
		  for (int i = 0; i < 5; i++) {
		  	for (int j = 0; j < 5; j++) {
		  		System.out.println("Die " + i + "te Potenz von " + j + " ist " + pow(i, j));
		  	}
		  }
		 */
	}
}