package tn.iit.observer;

import java.util.Observable;
import java.util.Observer;

import tn.iit.subject.WeatherData;

public class SatisticsDisplay implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		WeatherData wd =(WeatherData) o;
		int temperature = wd.getTemperature();
		int pressure = wd.getPressure();
		int humidity = wd.getHumidity();
		System.out.println("------------------------------");
		System.out.println("SatististDisplay");
		System.out.println("temperature = "+temperature);
		System.out.println("humidity = "+humidity);
		System.out.println("pressure = "+pressure);
		
	}

	
}
