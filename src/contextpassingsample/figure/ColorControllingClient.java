package contextpassingsample.figure;

/**
 * FiggureElementが作成された際に、色を指定するクライアント側に属するクラス
 * @author honyaryousuke
 *
 */
public class ColorControllingClient {

	public String colorFor(FigureElement element){
		if(element.getSize() > 100){
			return "RED";
		}
		return "BLUE";
	}
	
	public FigureElement getFigure(){
		return new Figure().makeLine();
	}
	
}
