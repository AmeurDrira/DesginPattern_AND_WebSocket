package iit.tn.beverage;

public class Tea extends Beverage{


	public Tea()
	{
		setDescription(description);
		setPrix(prix);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "tea";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return (float)700;
	}

	
	

}
