package tn.enis.observers;

import tn.enis.subject.Chrono;

public class DisplayAiguille implements DisplayObserver {
	Chrono chrono;

	public DisplayAiguille(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.registerDisplay(this);
	}

	public void afficheTempsEcoule() {
		System.out.println("afficheTempsEcoule");
		System.out.println(chrono.getHeures()+":"+chrono.getMinutes()+":"+chrono.getSecondes());
		
	}
	

}
