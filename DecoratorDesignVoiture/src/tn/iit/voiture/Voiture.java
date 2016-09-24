package tn.iit.voiture;

public abstract class Voiture {
	
	private String description;
	private float cost;
	
	
	public Voiture(String description, float cost) {
		super();
		this.description = description;
		this.cost = cost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public float cost() {
		return cost;
	}
	
	

}
