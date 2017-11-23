import gdi.pinboard.*;

public class ElectricCircuit {

	public static void main(String[] args) {
		Pinboard p = new Pinboard(args);
		Battery ba = new Battery();
		Switch s = new Switch();
		Bulb bu = new Bulb();
		
		ba.putAtPin(3, 1, p);
		s.putAtPin(3, 4, p);
		bu.putAtPin(6, 0, p);
		
		Wire w1 = new Wire();
		Wire w2 = new Wire();
		Wire w3 = new Wire();
		Wire w4 = new Wire();
		Wire w5 = new Wire();
		Wire w6 = new Wire();
		Wire w7 = new Wire();
		Wire w8 = new Wire();
		Wire w9 = new Wire();
		Wire w10 = new Wire();
		Wire w11 = new Wire();
		Wire w12 = new Wire();
		Wire w13 = new Wire();

		w1.putAtPin(2, 1, p);
		w2.putAtPin(2, 2, p);
		w3.putAtPin(2, 3, p);
		w4.putAtPin(2, 4, p);
		w5.putAtPin(4, 1, p);
		w6.putAtPin(4, 0, p);
		w7.putAtPin(5, 0, p);
		w8.putAtPin(6, 1, p);
		w9.putAtPin(6, 2, p);
		w10.putAtPin(6, 3, p);
		w11.putAtPin(6, 4, p);
		w12.putAtPin(5, 4, p);
		w13.putAtPin(4, 4, p);
	}

}
