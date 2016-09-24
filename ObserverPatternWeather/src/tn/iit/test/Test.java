package tn.iit.test;

import tn.iit.observer.CurrentConditionDislay;
import tn.iit.observer.SatisticsDisplay;
import tn.iit.subject.WeatherData;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData data = new WeatherData(23, 14, 90);
		CurrentConditionDislay csd = new CurrentConditionDislay();
		SatisticsDisplay stat = new SatisticsDisplay();
		data.registerObserver(csd);
		data.registerObserver(stat);
		data.notifyObserver();

	}
	

}
