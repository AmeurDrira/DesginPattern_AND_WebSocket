package iit.tn.decorator;

import iit.tn.beverage.Beverage;

public class  Mint extends CondimentDecorator{

	
	
	public Mint(Beverage b) {
		this.beverage=b;
		// TODO Auto-generated constructor stub
	}
	@Override
	public float getPrix() {
		// TODO Auto-generated method stub
		return (float)100;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "mint";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return beverage.getPrix()+ getPrix();
	}

	@Override
	public String toString() {
		return "Mint [= " + getPrix() + ", avec ="
				+ getDescription() + ", cost()=" + cost() + "]";
	}
	

}
