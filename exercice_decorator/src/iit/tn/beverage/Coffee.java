package iit.tn.beverage;

public class Coffee extends Beverage{


	/*public Coffee() {
		super(prix, description);
		// TODO Auto-generated constructor stub
	}
*/
	public Coffee() {
		setDescription(description);
		setPrix(prix);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "coffe";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float) 500.0;
	}

}
