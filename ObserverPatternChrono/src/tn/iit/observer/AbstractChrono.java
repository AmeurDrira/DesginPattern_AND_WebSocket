package tn.iit.observer;


public abstract class AbstractChrono {
	int secondes;
	int minutes;
	int heures;
	
	public AbstractChrono() {
		super();
	}
	public abstract void registerDisplay(DisplayObserver displayObserver);
	public abstract void removeDisplay(DisplayObserver displayObserver);
	public abstract void notifyDisplay();

	public abstract void registerSonnerie(SonnerieObserver sonnerieObserver);
	public abstract void removeSonnerie(SonnerieObserver sonnerieObserver);
	public abstract void notifySonnerie();

	public abstract void tick(int seconde, int minute, int heure);

	public int getSecondes() {
		return secondes;
	}

	public void setSecondes(int secondes) {
		this.secondes = secondes;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}
	
}
