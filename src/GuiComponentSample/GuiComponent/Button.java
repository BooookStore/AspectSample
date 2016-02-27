package GuiComponentSample.GuiComponent;

public class Button extends GuiComponent {

	public void setName(String s){
		System.out.println("Button set name s");
	}
	
	public void setWidth(int w){
		System.out.println("Button set widht " + w);
	}
	
	public void setHeight(int h){
		System.out.println("Button set height " + h);
	}
	
	public void resetPos(){
		System.out.println("Button reset position");
	}
}
