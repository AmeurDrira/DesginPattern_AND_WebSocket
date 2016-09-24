package tn.iit.individu;

import tn.iit.behavior.ComportementEpee;

public class Chevalier extends Individu {
	

	public Chevalier() {

		arme=new ComportementEpee();
	}

	@Override
	public void display() {
		System.out.println("je suis Chevalier");
	}

}
