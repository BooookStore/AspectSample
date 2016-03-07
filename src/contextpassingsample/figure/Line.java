package contextpassingsample.figure;

import contextpassingsample.figure.FigureElement;

public class Line extends FigureElement {

	@Override
	public void setColor(String s){
		System.out.println("Set " + s);
	}

	@Override
	public int getSize() {
		return 200;
	}
	
	
	
}
