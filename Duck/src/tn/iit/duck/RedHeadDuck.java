package tn.iit.duck;

import tn.iit.behavior.FlyWithWings;
import tn.iit.behavior.Quack;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		fbehavior = new FlyWithWings();
		qbehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("Je suis REdHeadDuck ");

	}

}
