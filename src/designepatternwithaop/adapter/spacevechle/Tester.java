package designepatternwithaop.adapter.spacevechle;

import java.util.ArrayList;
import java.util.List;

public class Tester {

	public static void main(String[] args){
		
		RadiationDetector radiationDetector = new RadiationDetector();
		TemperatureGauge temperatureGauge = new TemperatureGauge();

		List<StatusSensor> sensors = new ArrayList<>();
		sensors.add(radiationDetector);
		sensors.add(temperatureGauge);
		
		for(StatusSensor sensor : sensors){
			System.out.println(sensor.getStatus());
		}
		
	}
	
}
