
import gdi.universe.*;

public class SpaceFlight {

	public static void main(String[] args) {

		Universe u = new Universe(args);
		Planet planetA = new Planet(75, 510);
		Planet planetB = new Planet(585, 618);
		planetA.setClouds(true);
		u.addEntity(planetB);
		u.addEntity(planetA);
		u.simulate();
		Rocket rocketA = new Rocket();
		Rocket rocketB = new Rocket();
		u.addEntity(rocketA);
		u.addEntity(rocketB);
		rocketA.setLocationRelativeToPlanet(planetA, 28, 255);
		rocketB.setLocationRelativeToPlanet(planetB, -66, 243);
		rocketA.launchIn(3);
		rocketB.launchIn(5);
	}

}
