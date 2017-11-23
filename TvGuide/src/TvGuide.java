
import gdi.tv.*;
public class TvGuide {

	public static void main(String[] args) {
		String[] weekDays = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
		Helper.registerWeek(weekDays, args);
		int[] beginnSendung = {23, 18, 8, 20, 12, 22, 10};
		int[] endeSendung = {3, 20, 10, 2, 22, 3, 1};
		Helper.registerTimeSlots(beginnSendung, endeSendung);
		
		for (int i = 0; i < weekDays.length; i++) {
			System.out.println(weekDays[i] + ": " + beginnSendung[i] + ":00 - " + endeSendung[i] + ":00");
		}
		
		
		
		
		
		
		
		boolean ausstrahlung = false;
		System.out.print(weekDays[Helper.getDayOfWeek()] + ", " + Helper.getHour() + ":00: ");
		if (ausstrahlung == false) {
			System.out.print("keine Ausstrahlung");
		} else {
			System.out.print("Ausstrahlung");
		}
		
	}

}
