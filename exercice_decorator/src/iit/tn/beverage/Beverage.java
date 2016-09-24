package iit.tn.beverage;

public abstract class Beverage  {

	public float prix;
	public  String description;
	/*
	public Beverage(float prix, String description) {
		super();
		this.prix = prix;
		this.description = description;
	}*/
	public abstract String  getDescription ();
	public abstract float cost();
	
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
 // public static final ==> 3al les attributs dune interface