package GuiComponentSample.GuiComponent;

public class Tester {

	public static void main(String[] args){
		
		Button b = new Button();
		b.setName("Button");
		b.setHeight(100);
		b.resetPos();
		
		Scrollbar sc = new Scrollbar();
		sc.moveThumb();
	}
	
}
