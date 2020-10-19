package design_pattern.Watcher;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(); // subject
		
		CurrentConditionsDisplay currentDisplay = 
				new CurrentConditionsDisplay(weatherData); // watcher在构造函数中register subject
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}
