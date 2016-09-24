package tn.iit.duck;

import tn.iit.behavior.FlyNoWay;
import tn.iit.behavior.MuteQuack;

public class WoodenDuck extends Duck {
	
	
	public WoodenDuck() {		
	
		fbehavior = new FlyNoWay();
		 qbehavior = new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("Je suis WoodenDuck ");
		
	}

}
