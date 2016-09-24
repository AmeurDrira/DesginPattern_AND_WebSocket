package tn.iit.pizza;

public class SfaxStyleCheesePizza extends Pizza {

	public SfaxStyleCheesePizza() {

		System.out.println("SfaxStyleCheesePizza");
	}

	@Override
	public void prepare() {
		System.out.println("le Pizza se prepare");
	}

	@Override
	public void bake() {
		System.out.println("le Pizza se prepare");
	}

	@Override
	public void cut() {
		System.out.println("le Pizza se prepare");
	
	}

	@Override
	public void box() {
		System.out.println("le Pizza in box");
	
	}

}
