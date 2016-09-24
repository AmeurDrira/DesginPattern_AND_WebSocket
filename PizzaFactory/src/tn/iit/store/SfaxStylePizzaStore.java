package tn.iit.store;

import tn.iit.pizza.Pizza;
import tn.iit.pizza.SfaxStyleCheesePizza;
import tn.iit.pizza.SfaxStyleClamPizza;
import tn.iit.pizza.SfaxStylePepperoniPizza;

public class SfaxStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new SfaxStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new SfaxStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new SfaxStyleClamPizza();
		}
		return pizza;
	}
	
	
	
	
}
