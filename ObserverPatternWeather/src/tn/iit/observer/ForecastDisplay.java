package tn.iit.observer;

public class ForecastDisplay implements Observer {

	@Override
	public void update(int temperature, int humidity, int pressure) {
		
		System.out.println("le Forecast dit que demain la temperature est : ");
		System.out.println("le Forecast dit que demain l'humidite  est : ");
		System.out.println("le Forecast dit que demain la pression  est : ");

	}

}
