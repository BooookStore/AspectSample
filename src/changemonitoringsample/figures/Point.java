package changemonitoringsample.figures;

public class Point extends FigureElement {

	public void setX(int x){
		System.out.println(super.log);
	}
	
	public void setY(){
		System.out.println(super.log);
	}
	
	@Override
	public void setXY(int x, int y) {
		System.out.println(super.log);
	}

}
