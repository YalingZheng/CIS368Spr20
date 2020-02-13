package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.Collections;

public class StatisticsDisplay implements Observer, DisplayElement {
	private ArrayList<Float> temperatureList;
	private ArrayList<Float> humidityList;
	private Subject weatherData;

	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
		temperatureList = new ArrayList<Float>();
		humidityList = new ArrayList<Float>();
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperatureList.add(temperature);
		this.humidityList.add(humidity);
		Collections.sort(this.temperatureList);
		Collections.sort(this.humidityList);
		display();
	}
	
	public float getMaxTemperature() {
		return this.temperatureList.get(temperatureList.size() - 1);
	}
	
	public float getMinTemperature() {
		return this.temperatureList.get(0);
	}
	
	public float getAverageTemperature() {
		float averagetemperature = 0;
		for (int i=0; i<temperatureList.size(); i++) {
			averagetemperature += temperatureList.get(i);
		}
		return averagetemperature/temperatureList.size();
	}
	

	public void display() {
		System.out.println("Avg/Max/Min temperature =  "+getAverageTemperature() 
			+ "/" + getMaxTemperature() + "/" + getMinTemperature());
	}
}
