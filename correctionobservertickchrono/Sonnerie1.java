package tn.enis.observers;

import tn.enis.subject.Chrono;

public class Sonnerie1 implements SonnerieObserver {
	Chrono chrono;

	public Sonnerie1(Chrono chrono) {
		super();
		this.chrono = chrono;
		chrono.registerSonnerie(this);
	}

	public void ding() {
		System.out.println("Sonnerie1");
		for (int i=0;i<chrono.getHeures();i++){
			System.out.print("ding ");
		}
		System.out.println();
		
	}
	

}
