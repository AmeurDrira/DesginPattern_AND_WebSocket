package iit.tn.test;

import iit.tn.beverage.Beverage;
import iit.tn.beverage.Tea;
import iit.tn.decorator.Milk;
import iit.tn.decorator.Mint;

public class Test {
	public static void main (String [] args)
	{
		Beverage beverage = new Tea();
	//	beverage = new Milk(beverage);
		beverage = new Mint(beverage);
		System.out.println(beverage.toString());
		System.out.println(beverage.cost());
		
		
	}
	

}
