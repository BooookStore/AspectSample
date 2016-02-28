package changemonitoringsample.figures;

import changemonitoringsample.aspect.MoveTracking;

public class Tester {
	
	public static void main(String[] args){
		
		checkFigureMove();
		
		Line l = new Line();
		l.setP1(10, 10);
		
		Point p = new Point();
		p.setX(100);
		
		FigureElement f = new Point();
		f.setXY(10, 10);
		
		checkFigureMove();
	}
	
	public static void checkFigureMove(){
		System.out.println("Move is " + MoveTracking.testAndClear());
	}
	
}
