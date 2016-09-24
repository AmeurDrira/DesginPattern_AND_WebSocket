package iit.tn.decorator;

import iit.tn.beverage.Beverage;

public class Milk extends CondimentDecorator{

	
	public Milk(Beverage b) {
		this.beverage=b;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getPrix() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "milk";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + getPrix();
	}

	@Override
	public String toString() {
		return "Milk  =" + getPrix() + ", with "
				+ beverage.getDescription() + "=" + beverage.cost() +" total = " + cost();
	}
	
	

}
