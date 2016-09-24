package tn.iit.decorator;
import tn.iit.voiture.Voiture;

public abstract class CondimemntDecorator extends Voiture {

	private Voiture voiture;
	
	public CondimemntDecorator(String description, float cost, Voiture voiture ) {
		super(description, cost);
		this.voiture=voiture;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	
	public String getDescription() {
		return getVoiture().getDescription()+" avec "+super.getDescription();
	}
	
	public float cost(){
		return getVoiture().cost()+getCost();

	}


}
