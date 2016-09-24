package tn.iit.test;


import tn.iit.observer.CurrentConditionDislay;
import tn.iit.observer.ForecastDisplay;
import tn.iit.observer.SatisticsDisplay;
import tn.iit.subject.WeatherData;

public class Test {

	public static void main(String[] args) {
		
		WeatherData data = new WeatherData();
		
		CurrentConditionDislay ccd =new CurrentConditionDislay();
		ForecastDisplay fd=new ForecastDisplay();
		SatisticsDisplay sd=new SatisticsDisplay();
		
		data.addObserver(sd);
		data.addObserver(fd);
		data.addObserver(ccd);
		
		data.measurementChanged(34, 60, 90);
		data.measurementChanged(45, 10, 9);
		data.deleteObserver(fd);
		data.measurementChanged(30, 70, 90);

		
		
	}
	

}
