package iit.tn.decorator;

import iit.tn.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

	Beverage beverage;

	public abstract float getPrix();

	

}
