package FigureEditorSample.FigureEditor;

public class Tester {
	public static void main(String[] args){
		
		Point p = new Point(0, 0);
		p.setX(10);
		p.setXY(10, 20);
		
		Line l = new Line(0, 0);
		l.setX(100);
		l.setXY(100, 100);
		
		//Figureに各FigureElementを作成するファクトリをセット
		Figure f = new Figure();
		f.setPointFactory((x,y) -> new Point(x,y));
		f.setLineFactory((x,y) -> new Line(x,y));
		
		f.makePoint(10, 100);
		f.makePoint(10, 100);
		f.makeLine(10, 100);
		f.makeLine(10, 100);
	}
}
