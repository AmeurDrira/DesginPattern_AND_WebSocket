package tn.iit.test;

import tn.iit.behavior.ComportementArcFleche;
import tn.iit.behavior.ComportementCouteau;
import tn.iit.behavior.ComportementEpee;
import tn.iit.individu.Archer;
import tn.iit.individu.Chevalier;
import tn.iit.individu.Riene;

public class Test {

	@SuppressWarnings("unused")
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComportementArcFleche fleche=new ComportementArcFleche();
		ComportementEpee epee= new ComportementEpee();
		ComportementCouteau couteau =new ComportementCouteau();

		Archer archer = new Archer();
		Chevalier chevalier = new Chevalier();
		Riene riene = new Riene();
		
		archer.display();
		archer.combattre();
		
		System.out.println("---------------------------");
		
		chevalier.display();
		chevalier.combattre();
		
		System.out.println("---------------------------");
		
		riene.display();
		riene.combattre();
		
		System.out.println("---------------------------");
		riene.setArme(fleche);
		riene.display();
		riene.combattre();
		
		
		
		
	}

}
