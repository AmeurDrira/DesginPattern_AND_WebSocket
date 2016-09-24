package tn.iit.test;

import tn.iit.store.PizzaStore;
import tn.iit.store.TunisStylePizzaStore;
import tn.iit.store.SfaxStylePizzaStore;

public class Main {

	public static void main(String[] args) {
		
		
		PizzaStore pizzatn=new TunisStylePizzaStore();
		PizzaStore pizzatn2=new TunisStylePizzaStore();
		PizzaStore pizzasf = new SfaxStylePizzaStore();
		

		pizzatn.orderPizza("cheese");

	}

}
