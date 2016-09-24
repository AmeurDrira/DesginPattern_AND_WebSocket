package tn.iit.individu;

import tn.iit.behavior.ComportementArcFleche;

public class Archer extends Individu {
	

	public Archer() {

		 arme = new ComportementArcFleche();
	}

	@Override
	public void display() {
		System.out.println("Je suis un Archer");
	}

}
