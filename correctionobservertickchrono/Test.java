package tn.enis.test;

import tn.enis.observers.DisplayAiguille;
import tn.enis.observers.DisplayNumerique;
import tn.enis.observers.DisplayObserver;
import tn.enis.observers.Sonnerie1;
import tn.enis.observers.Sonnerie2;
import tn.enis.observers.SonnerieObserver;
import tn.enis.subject.Chrono;

public class Test {
	public static void main(String[] args) {
		Chrono chrono = new Chrono();
		SonnerieObserver sonnerie1 = new Sonnerie1(chrono);
		SonnerieObserver sonnerie2 = new Sonnerie2(chrono);
		DisplayObserver display1 = new DisplayNumerique(chrono);
		DisplayObserver display2 = new DisplayAiguille(chrono);
		for (int i = 3595; i < 5000; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print("erreur");
			}
			chrono.tick((i % 3600) % 60, (int) ((i % 3600) / 60),
					(int) (i / 3600));
		}
	}

}
