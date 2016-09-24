package tn.iit.decorator;

import tn.iit.voiture.Voiture;

public class VitreElectrique extends CondimemntDecorator {

	public VitreElectrique(float cost, Voiture voiture) {
		super("VitreElectrique", cost, voiture);
	}

	

}
