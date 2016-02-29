package designepatternwithaop.adapter.spacevechle;

public class RadiationAdapter implements StatusSensor {

	private final RadiationDetector underlying;
	
	public RadiationAdapter(RadiationDetector underlying) {
		super();
		this.underlying = underlying;
	}

	@Override
	public String getStatus() {
		if(underlying.getCurrentRadiationLevel() > 1.5){
			return "DANGER";
		}
		return "OK";
	}

}
