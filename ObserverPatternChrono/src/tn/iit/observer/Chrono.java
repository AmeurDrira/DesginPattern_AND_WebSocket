package tn.iit.observer;

import java.util.ArrayList;
import java.util.List;

public class Chrono extends AbstractChrono {
	List<DisplayObserver> displays = new ArrayList<DisplayObserver>();
	List<SonnerieObserver> sonneries = new ArrayList<SonnerieObserver>();
	int ancienHeure = 0;

	public void tick(int seconde, int minute, int heure) {
		setHeures(heure);
		setMinutes(minute);
		setSecondes(seconde);
		notifyDisplay();
		if (ancienHeure != heure) {
			notifySonnerie();
			ancienHeure = heure;
		}
	}

	public void registerDisplay(DisplayObserver displayObserver) {
		displays.add(displayObserver);

	}

	public void removeDisplay(DisplayObserver displayObserver) {
		displays.remove(displayObserver);

	}

	public void notifyDisplay() {
		for (DisplayObserver d : displays) {
			d.afficheTempsEcoule(getHeures(), getMinutes(), getSecondes());
		}

	}

	public void registerSonnerie(SonnerieObserver sonnerieObserver) {
		sonneries.add(sonnerieObserver);

	}

	public void removeSonnerie(SonnerieObserver sonnerieObserver) {
		sonneries.remove(sonnerieObserver);

	}

	public void notifySonnerie() {
		for (SonnerieObserver s : sonneries) {
			s.ding(getHeures());
		}

	}

}
