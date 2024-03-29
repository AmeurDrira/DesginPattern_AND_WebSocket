package tn.iit.store;

import tn.iit.pizza.Pizza;

public abstract class PizzaStore {

	public abstract Pizza createPizza(String type);

	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
