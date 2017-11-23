public class DiceCount {

	public static void main(String[] args) {
		final int anzahlWuerfel = 5;

		// alle Wuerfel werfen und die geworfenen Werte der Reihe nach in das Array speichern
		int[] wuerfelWerte = new int[anzahlWuerfel];
		for (int wuerfel = 0; wuerfel < anzahlWuerfel; ++wuerfel) {
			wuerfelWerte[wuerfel] = (int)(Math.random()*6) + 1;
		}

		System.out.println("Geworfene Wuerfel: " + java.util.Arrays.toString(wuerfelWerte));

		int[] gezaehlt = new int[5];
		for(int i=0; i < gezaehlt.length; i++) {
			while(wuerfelWerte[i].equals(i+1))
				gezaehlt[i] = gezaehlt[i] + 1;				
		}	
		System.out.println("Anzahl 1er" + gezaehlt[0]);
		System.out.println("Anzahl 2er" + gezaehlt[1]);
		System.out.println("Anzahl 3er" + gezaehlt[2]);
		System.out.println("Anzahl 4er" + gezaehlt[3]);
		System.out.println("Anzahl 5er" + gezaehlt[4]);
		System.out.println("Anzahl 6er" + gezaehlt[5]);
	}

}