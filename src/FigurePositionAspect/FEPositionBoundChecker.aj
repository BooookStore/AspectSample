package FigurePositionAspect;

import FigureEditor.FigureElement;

/**
 * FigureElementの位置が変更される際に、変更が正しいかをチェックします。
 * @author honyaryousuke
 *
 */
public aspect FEPositionBoundChecker extends FEPosition {

	before(FigureElement fe,int x,int y) : setXY(fe,x,y){
		if(x < 0 || y < 0){
			throw new IllegalArgumentException();
		}
	}
	
	before(FigureElement fe,int arg) : setXorY(fe,arg){
		if(arg < 0){
			throw new IllegalArgumentException();
		}
	}
}
