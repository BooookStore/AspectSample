package contactenforcementsample.registor;

import java.lang.IllegalAccessException;

public class Tester {

	public static void main(String[] args) throws IllegalAccessException {
		
		//ここでは例外は発生しない
		Registory elementRegistory = new Registory();
		FigureElement.makeButton(elementRegistory);
		
		//FigureElement.make*(..)以外の場所でRegistory.registerを実行するため例外が発生
		Button b  = new Button();
		elementRegistory.register(b); //このメソッド実行前に例外がスローされる
		
	}
	
}
