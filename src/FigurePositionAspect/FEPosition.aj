package FigurePositionAspect;

import FigureEditor.FigureElement;

/**
 * FigureElementの位置が変更されるメソッドへのポイントカットを宣言しています。
 * @author honyaryousuke
 *
 */
public abstract aspect FEPosition {
	
	/**
	 * FigureElementのXとYの位置を同時に指定するメソッドへのポイントカット
	 * @param fe
	 * @param x
	 * @param y
	 */
	pointcut setXY(FigureElement fe,int x,int y) :
		call(void FigureElement.setXY(int,int)) && target(fe) && args(x,y);

	/**
	 * FigureElementのXとYのどちらかの位置を指定するメソッドへのポイントカット
	 * @param fe
	 * @param arg
	 */
	pointcut setXorY(FigureElement fe,int arg) : 
		(call(void FigureElement.setX(int)) &&	target(fe) && args(arg) ||
		(call(void FigureElement.setY(int)) && target(fe) && args(arg)));
	
	/**
	 * 継承先のアスペクトが使用する文字列
	 */
	public String preString = "[Aspect Logg]\t";
	
}
