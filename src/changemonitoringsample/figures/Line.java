package changemonitoringsample.figures;

public class Line extends FigureElement {

	public void setP1(int x,int y){
		System.out.println(super.log);
	}

	public void setP2(int x,int y){
		System.out.println(super.log);
	}
	
	@Override
	public void setXY(int x, int y) {
		System.out.println(super.log);
	}
	
}
