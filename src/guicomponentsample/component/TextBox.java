package guicomponentsample.component;


public class TextBox extends GuiComponent {

	public void setLength(int l){
		System.out.println("TextBox is set length" + l);
	}
	
	public void setHeight(int h){
		System.out.println("TextBox is set height " + h);
	}
	
	public void setText(String s){
		System.out.println("TextBox is text " + s);
	}
	
}
