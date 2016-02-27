package FigureEditor;

public abstract class FigureElement {
	
	public abstract void setXY(int x,int y);
	
	public abstract void setX(int x);
	
	public abstract void setY(int y);
	
	public abstract Integer getX();

	public abstract Integer getY();
	
	@Override
	public String toString(){
		return "[" + getX() + "," + getY() + "]";
	}
}
