package figureeditorsample.aspect;
import figureeditorsample.editor.FigureElement;




/**
 * FigureElementの位置が変更される際に、ログを出力します。
 * @author honyaryousuke
 *
 */
public aspect FEPositionLogger extends FEPosition {

	after(FigureElement fe,int x,int y) : setXY(fe,x,y){
		System.out.println(super.preString + fe.getClass().getSimpleName() + " is move to [" + x + "," + y +"]" );
	}

	after(FigureElement fe,int arg) : setXorY(fe,arg){
		if(thisJoinPoint.getSignature().getName() == "setX"){
			System.out.println(super.preString + fe.getClass().getSimpleName() + " is move x to [" + arg +"]" );
		}else{
			System.out.println(super.preString + fe.getClass().getSimpleName() + " is move y to [" + arg +"]" );
		}
	}
}
