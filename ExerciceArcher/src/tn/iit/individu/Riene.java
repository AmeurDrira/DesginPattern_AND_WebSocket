package tn.iit.individu;

import tn.iit.behavior.ComportementCouteau;

public class Riene extends Individu{
	
	
	public Riene( ) {
		arme = new ComportementCouteau();
	}

	ComportementCouteau couteau =new ComportementCouteau();

	@Override
	public void display() {
		System.out.println("Je suis la riene");
	}

}
