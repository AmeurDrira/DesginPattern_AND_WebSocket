package tn.iit.decorator;

import tn.iit.voiture.Voiture;

public class Abs extends CondimemntDecorator {

	public Abs(float cost, Voiture voiture) {
		super("ABS", cost, voiture);
	}

}
