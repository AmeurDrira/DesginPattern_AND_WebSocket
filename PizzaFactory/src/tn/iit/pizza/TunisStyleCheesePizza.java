package tn.iit.pizza;

public class TunisStyleCheesePizza extends Pizza {

	public TunisStyleCheesePizza() {
		System.out.println("TunisStyleCheesePizza");
	}

	@Override
	public void prepare() {
		System.out.println("Pizza se prepare");
		
	}

	@Override
	public void bake() {
		System.out.println("Pizza en cui");
		
	}

	@Override
	public void cut() {
		System.out.println("Pizza en caut");
		
	}

	@Override
	public void box() {
		System.out.println("Pizza in box");
		
	}

	

}
