package contactenforcementsample.registor;

import java.util.ArrayList;
import java.util.List;

public class Registory {

	public List<FigureElement> registory = new ArrayList<>();
	
	public void register(FigureElement f) throws IllegalAccessException {
		registory.add(f);
	}
	
}
