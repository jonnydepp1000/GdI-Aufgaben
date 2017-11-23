
public class Plong {

	public static void main(String[] args) {
		
		//TODO: Das Programm gibt ein Plong aus bei allen Zahlen, 
		//die durch 3 oder 4, aber nicht durch 5 teilbar sind.
		
		int i;
		for(i = 1; i <= 30; ++i) {
			if( ( 0 == i % 4 || 0 == i % 3 ) && (i % 5 != 0) ) {
				System.out.println("Plong! ");
			}
			else {
				System.out.println( i + " ");
			}				
		}
	}
}
