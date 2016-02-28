package changemonitoringsample.figures;

public abstract class FigureElement {

	protected String log = this.getClass().getSimpleName() + " moved";
	
	public abstract void setXY(int x,int y);
	
}
