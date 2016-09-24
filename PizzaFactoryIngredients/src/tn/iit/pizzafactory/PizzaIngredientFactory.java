package tn.iit.pizzafactory;

import tn.iit.ingredient.Cheese;
import tn.iit.ingredient.Clam;
import tn.iit.ingredient.Sauce;

public interface PizzaIngredientFactory {
	Sauce CreateSauce();

	Cheese CreateChesse();

	Clam CreateClam();

}
