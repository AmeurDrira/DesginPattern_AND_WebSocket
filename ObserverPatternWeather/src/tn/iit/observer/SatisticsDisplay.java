package tn.iit.observer;

public class SatisticsDisplay implements Observer {

	private float satistique;
	@Override
	public void update(int temperature, int humidity, int pressure) {
	
		satistique=(temperature*humidity*pressure)/3;
		System.out.println("le statistique dit que demain la temperature est : "+satistique);
		System.out.println("le statistique dit que demain l'humidite  est : "+satistique);
		System.out.println("le statistique dit que demain la pression  est : "+satistique);
		
	}

}
