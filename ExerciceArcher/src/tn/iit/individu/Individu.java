package tn.iit.individu;

import tn.iit.behavior.ComportementArme;

public abstract class Individu {
	
	protected ComportementArme arme; 
	

	public abstract void display();
	
	public void combattre()
	{
		arme.utliseArme();
	}
	
	public void setArme(ComportementArme arme) {
		this.arme = arme;
	}

}
