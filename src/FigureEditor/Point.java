package FigureEditor;

public class Point extends FigureElement{

	private int _x = 0;
	
	private int _y = 0;
	
	public Point(int _x, int _y) {
		super();
		this._x = _x;
		this._y = _y;
	}
	
	public void setXY(int x,int y){
		setX(x);
		setY(y);
	}

	@Override
	public void setX(int x) {
		_x = x;
	}

	@Override
	public void setY(int y) {
		_y = y;
	}
	
	@Override
	public Integer getX() {
		return _x;
	}

	@Override
	public Integer getY() {
		return _y;
	}

}
