import gdi.escape.*;

public class PrisonEscape {

	public static void main(String[] args) {

		Prison prison = new Prison(args);
		prison.openDoors();
		int crim = prison.getNumberOfCriminals();

		// Polizisten generieren und auf den Platz senden

		for (int l = 0; l < crim; l++) {
			Actor police = new Actor(prison, Actor.Type.POLICE);
			int randRow = (int) (prison.getNumberOfRows() * Prison.random());
			int randCol = (int) (prison.getNumberOfColumns() * Prison.random());
			police.moveTo(randRow, randCol);
		}

		prison.waitForActors();

		// Verbrecher generieren und auf den Platz senden

		int criminal = 0;
		while (criminal < crim) {
			int randRow = (int) (prison.getNumberOfRows() * Prison.random());
			int randCol = (int) (prison.getNumberOfColumns() * Prison.random());
			if (prison.isUnoccupied(randRow, randCol) == true) {
				Actor actor = new Actor(prison, Actor.Type.CRIMINAL);
				actor.moveTo(randRow, randCol);
				criminal++;
			}
		}

		prison.waitForActors();

		/* 
		 * jeweils einen Polizeimann zu einem Gefangenen laufen lassen, danach
		 * Kriminelle erfassen und Koordinaten in ein Array schreiben
		 * Polizisten erfassen und jeweils einen Polizisten zu einem Kriminellen schicken
		 * 
		 */

		int criminalsRow[] = new int[crim];
		int criminalsCol[] = new int[crim];

		int i = 0;
		int j = 0;
		while (i < 2 * crim) {
			if (prison.getActor(i).getType() == Actor.Type.CRIMINAL) {
				criminalsRow[j] = prison.getActor(i).getRow();
				criminalsCol[j] = prison.getActor(i).getCol();
				j++;
			}
			i++;
		}

		int h = 0;
		int k = 0;
		while (h < 2 * crim) {
			if (prison.getActor(h).getType() == Actor.Type.POLICE) {
				prison.getActor(h).moveTo(criminalsRow[k], criminalsCol[k]);
				k++;
			}
			h++;
		}

		prison.celebrate();

	}

}
