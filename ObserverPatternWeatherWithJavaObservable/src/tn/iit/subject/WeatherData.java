package tn.iit.subject;

import java.util.Observable;

public class WeatherData extends Observable {

	private int temperature;
	private int humidity;
	private int pressure;
	

	public WeatherData() {

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
	
	public void measurementChanged(int temperature, int humidity, int pressure)
	{
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		setChanged();
		notifyObservers(null);
		
	}

}
