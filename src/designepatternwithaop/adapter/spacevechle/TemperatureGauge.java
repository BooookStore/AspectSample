package designepatternwithaop.adapter.spacevechle;

import java.util.Random;

public class TemperatureGauge {

	public int readTemprature(){
		return new Random().nextInt(100);
	}
	
}
