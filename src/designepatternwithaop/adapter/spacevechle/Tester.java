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
	
	public static void nonAdapter(){
		
		RadiationDetector rd = new RadiationDetector();
		TemperatureGauge tg = new TemperatureGauge();
		
		double result1 = rd.getCurrentRadiationLevel();
		int result2 = tg.readTemprature();
		
		if(result1 > 1.5 ){
			System.out.println("ERROR");
		}else{
			System.out.println("OK");
		}
		
		if(result2 > 1.5 ){
			System.out.println("ERROR");
		}else{
			System.out.println("OK");
		}
		
	}
	
}
