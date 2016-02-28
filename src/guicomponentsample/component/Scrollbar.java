package guicomponentsample.component;


public class Scrollbar extends GuiComponent {

	public void setX(int x){
		System.out.println("Scrollbar is set x " + x);
	}
	
	public void setY(int y){
		System.out.println("Scrollbar is set y " + y);
	}
	
	public void moveThumb(){
		System.out.println("Scrollbar is thumb");
	}
	
}
