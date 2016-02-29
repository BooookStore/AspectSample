package designepatternwithaop.adapter.spacevechle;

import java.util.Random;

public class RadiationDetector {

	public double getCurrentRadiationLevel(){
		return new Random().nextDouble();
	}
	
}
