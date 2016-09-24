package tn.iit.test;

import tn.iit.pizzafactory.PizzaIngredientFactory;
import tn.iit.pizzafactory.SfaxPizzaIngredientFactory;

public class Main {

	public static void main(String[] args) {
			PizzaIngredientFactory pizzaSfax=new SfaxPizzaIngredientFactory();
			pizzaSfax.CreateSauce();
			pizzaSfax.CreateClam();
			pizzaSfax.CreateChesse();
			
	}

}
