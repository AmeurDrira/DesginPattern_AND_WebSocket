package tn.iit.pizzafactory;

import tn.iit.ingredient.Cheese;
import tn.iit.ingredient.Clam;
import tn.iit.ingredient.Mozzarella;
import tn.iit.ingredient.Palourde;
import tn.iit.ingredient.PlumTomatoSauce;
import tn.iit.ingredient.Sauce;

public class TunisPizzaIngredientFactory implements PizzaIngredientFactory {

	Palourde clam;
	Mozzarella cheese;
	PlumTomatoSauce sauce;

	@Override
	public Sauce CreateSauce() {
		this.sauce = new PlumTomatoSauce();
		return sauce;

	}

	@Override
	public Clam CreateClam() {
		this.clam = new Palourde();
		return clam;
	}

	@Override
	public Cheese CreateChesse() {
		this.cheese = new Mozzarella();
		return cheese;
	}

}
