package designepatternwithaop.adapter.aspect;

import designepatternwithaop.adapter.spacevechle.RadiationDetector;
import designepatternwithaop.adapter.spacevechle.StatusSensor;
import designepatternwithaop.adapter.spacevechle.TemperatureGauge;

public aspect SensorAdapter {
	
	declare parents : (TemperatureGauge || RadiationDetector) implements StatusSensor;

	public String TemperatureGauge.getStatus(){
		if(this.readTemprature() > 160){
			return "DANGER";
		}
		return "OK";
	}
	
	public String RadiationDetector.getStatus(){
		if(this.getCurrentRadiationLevel() > 160){
			return "DANGER";
		}
		return "OK";
	}
}
