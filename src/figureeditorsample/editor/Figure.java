package figureeditorsample.editor;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Figure {
	
	private List<FigureElement> elements = new ArrayList<FigureElement>();
	
	/**
	 * pointを生成するファクトリクラス
	 */
	private BiFunction<Integer,Integer,FigureElement> pointFactory;

	/**
	 * lineを生成するファクトリクラス
	 */
	private BiFunction<Integer,Integer,FigureElement> lineFactory;
	
	/**
	 * pointファクトリクラスのセット
	 * @param factory
	 */
	public void setPointFactory(BiFunction<Integer, Integer, FigureElement> factory){
		pointFactory = factory;
	}

	/**
	 * lineファクトリクラスのセット
	 * @param factory
	 */
	public void setLineFactory(BiFunction<Integer, Integer, FigureElement> factory){
		lineFactory = factory;
	}
	
	/**
	 * pointを追加
	 * @param x
	 * @param y
	 */
	public void makePoint(Integer x,Integer y){
		elements.add(pointFactory.apply(x, y));
	}
	
	/**
	 * lineを追加
	 * @param x
	 * @param y
	 */
	public void makeLine(Integer x,Integer y){
		elements.add(lineFactory.apply(x, y));
	}

}
