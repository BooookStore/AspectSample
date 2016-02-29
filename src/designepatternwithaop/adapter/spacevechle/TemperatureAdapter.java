package designepatternwithaop.adapter.spacevechle;

public class TemperatureAdapter implements StatusSensor {

	private final TemperatureGauge underlying;

	public TemperatureAdapter(TemperatureGauge underlying) {
		super();
		this.underlying = underlying;
	}

	@Override
	public String getStatus() {
		if(underlying.readTemprature() > 1.5){
			return "DANGER";
		}
		return "OK";
	}
	
}
