package tn.enis.observers;

import tn.enis.subject.Chrono;

public class Sonnerie2 implements SonnerieObserver {
	Chrono chrono;

	public Sonnerie2(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.registerSonnerie(this);
	}

	public void ding() {
		System.out.println("Sonnerie2");
		for (int i=0;i<chrono.getHeures();i++){
			System.out.print("pip ");
		}
		System.out.println();
		
	}

}
