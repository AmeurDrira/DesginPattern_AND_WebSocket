package tn.iit.subject;

import tn.iit.observer.Observer;

public interface Subject {

	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObserver();
	
	

}
