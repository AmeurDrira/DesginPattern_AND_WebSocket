package tn.iit.duck;

import tn.iit.behavior.FlyWithWings;
import tn.iit.behavior.Quack;

public class MallardDuck extends Duck{
	
	
	public  MallardDuck() {
		fbehavior = new FlyWithWings();
		 qbehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Je suis MallardDuck");
		
	}
	

}
