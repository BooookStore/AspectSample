package contactenforcementsample.registor;

public class FigureElement {

	static public void makeButton(Registory registory) throws IllegalAccessException{
		System.out.println("Button made.");
		registory.register(new Button());
	}
	
}
