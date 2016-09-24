
package tn.iit.duck;

import tn.iit.behavior.FlyBehavior;
import tn.iit.behavior.QuackBehavior;

public abstract class Duck {
	QuackBehavior qbehavior;
	FlyBehavior fbehavior;
	
	public void performQuack()
	{
		qbehavior.quack();
	}
	
	public void swim()
	{
		System.out.println("Je nage");
		
	}
	
	public abstract void display();
	
	public void performFly()
	{
		fbehavior.fly();
	}

	public void setQbehavior(QuackBehavior qbehavior) {
		this.qbehavior = qbehavior;
	}

	public void setFbehavior(FlyBehavior fbehavior) {
		this.fbehavior = fbehavior;
	}

	

}
