package tn.iit.test;

import tn.iit.decorator.Abs;
import tn.iit.decorator.VitreElectrique;
import tn.iit.voiture.Berline;
import tn.iit.voiture.Camionnette;
import tn.iit.voiture.Voiture;

public class Test {

	public static void main(String[] args) {
		
			Voiture v1=new Camionnette ("P404",10000);
			Voiture v2=new Berline ("P407",20000);
			v2=new VitreElectrique(1000, v2); // 1000 représente le prix de l’option
			v2=new Abs( 1200,v2); // 1200 représente le prix de l’option
			System.out.println("La voiture est une "+v1.getDescription());
			//affiche: La voiture est une P404 avec ABS
			System.out.println("Son prix est:"+ v1.cost());
			//affiche: Son prix est 10800
			System.out.println("La voiture est une "+v2.getDescription());
			//affiche: La voiture est une P407 avec VitreElectrique, AirBag
			System.out.println("Son prix est:"+ v2.cost());
			//affiche: Son prix est 22200

	}

}
