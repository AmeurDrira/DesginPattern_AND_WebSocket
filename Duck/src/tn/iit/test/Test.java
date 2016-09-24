package tn.iit.test;

import tn.iit.behavior.FlyRocketPowered;
import tn.iit.duck.MallardDuck;
import tn.iit.duck.RedHeadDuck;
import tn.iit.duck.WoodenDuck;

public class Test {

	FlyRocketPowered flyrocket;
	
	public static void main(String[] args) {
		
		MallardDuck mallarduck =new MallardDuck();
		WoodenDuck woodenduck =new WoodenDuck();
		RedHeadDuck redheadduck =new RedHeadDuck();
		FlyRocketPowered flyrocket=new FlyRocketPowered();
		
		
		mallarduck.display();
		mallarduck.swim();
		mallarduck.performFly();
		mallarduck.performQuack();
		
		System.out.println("--------------");
		
		woodenduck.display();
		woodenduck.swim();
		woodenduck.performFly();
		woodenduck.performQuack();
		
		System.out.println("--------------");
		
		redheadduck.display();
		redheadduck.swim();
		redheadduck.performFly();
		
		redheadduck.setFbehavior(flyrocket);
		
		redheadduck.performFly();
		redheadduck.performQuack();
		
		

	}

}
