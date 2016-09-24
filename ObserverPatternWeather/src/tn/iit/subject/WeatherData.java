package tn.iit.subject;

import java.util.ArrayList;

import tn.iit.observer.Observer;

public class WeatherData implements Subject {

	private int temperature;
	private int humidity;
	private int pressure;
	
	ArrayList<Observer> arrayobserver = new ArrayList<Observer>();

	public WeatherData(int temperature, int humidity, int pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public int getTemperature() {
		return temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public int getPressure() {
		return pressure;
	}
	
	public void measurementChanged()
	{
		temperature=getTemperature();
		humidity=getHumidity();
		pressure=getPressure();
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer observer) {
		arrayobserver.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		arrayobserver.remove(arrayobserver.indexOf(observer));
	}

	@Override
	public void notifyObserver() {
		for (Observer ob:arrayobserver) {
			ob.update(getTemperature(), getHumidity(), getPressure());
		}

	}

}
