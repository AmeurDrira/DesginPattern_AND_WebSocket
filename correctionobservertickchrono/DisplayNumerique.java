package tn.enis.observers;

import tn.enis.subject.Chrono;

public class DisplayNumerique implements DisplayObserver {
	Chrono chrono;

	public DisplayNumerique(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.registerDisplay(this);
	}

	public void afficheTempsEcoule() {
		System.out.println("DisplayNumerique");
		System.out.println(chrono.getHeures()+":"+chrono.getMinutes()+":"+chrono.getSecondes());
		
	}

}
