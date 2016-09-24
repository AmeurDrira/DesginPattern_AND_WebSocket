package tn.iit.pizzafactory;

import tn.iit.ingredient.Cheese;
import tn.iit.ingredient.Clam;
import tn.iit.ingredient.Clovis;
import tn.iit.ingredient.MarinaraSauce;
import tn.iit.ingredient.Parmesan;
import tn.iit.ingredient.Sauce;

public class SfaxPizzaIngredientFactory implements PizzaIngredientFactory {

	Parmesan cheese;
	MarinaraSauce sauce;
	Clovis clam;

	@Override
	public Sauce CreateSauce() {
		this.sauce = new MarinaraSauce();
		return sauce;
	}

	@Override
	public Clam CreateClam() {
		this.clam = new Clovis();
		return clam;

	}

	@Override
	public Cheese CreateChesse() {
		this.cheese = new Parmesan();
		return cheese;
	}

}
