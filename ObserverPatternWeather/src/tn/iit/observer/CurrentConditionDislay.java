package tn.iit.observer;

public class CurrentConditionDislay implements Observer {

	@Override
	public void update(int temperature, int humidity, int pressure) {
		
		System.out.println("La temprature d'aujourd'hui:" + temperature);
		System.out.println("L'himidite d'aujourd'hui:" + humidity);
		System.out.println("La pression d'aujourd'hui:" + pressure);

	}

}
