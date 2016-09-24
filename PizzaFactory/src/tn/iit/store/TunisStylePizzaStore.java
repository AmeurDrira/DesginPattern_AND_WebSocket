package tn.iit.store;

import tn.iit.pizza.Pizza;
import tn.iit.pizza.TunisStyleCheesePizza;
import tn.iit.pizza.TunisStyleClamPizza;
import tn.iit.pizza.TunisStylePepperoniPizza;

public class TunisStylePizzaStore extends PizzaStore {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new TunisStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new TunisStylePepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new TunisStyleClamPizza();
		}
		return pizza;
	}

	

}
