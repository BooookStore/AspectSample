package pointcutsample.figures;


public class Line extends FigureElement {

	private Point p1 = new Point();
	
	private Point p2 = new Point();
	
	@Override
	public void setXY(int x, int y) {
		p1.setXY(x, y);
		p2.setXY(x+10, y+10);
	}

	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

}
