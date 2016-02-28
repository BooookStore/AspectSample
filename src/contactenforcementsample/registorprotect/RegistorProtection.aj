package contactenforcementsample.registorprotect;

import contactenforcementsample.registor.Registory;
import contactenforcementsample.registor.FigureElement;

public aspect RegistorProtection {

	/**
	 * RegistoryがFigureElementを登録するメソッドコール内へのすべてのJoin Point
	 */
	pointcut register() : call(void Registory.register(FigureElement));
	
	/**
	 * FigureElementのmekeメソッド
	 */
	pointcut canRegister() : withincode(static * FigureElement.make*(..));

	/**
	 * FigureElement.make*(..)以外の場所にてRegistory.register(FigureElement)がコールされると
	 * IllegalAccessExceptionを投げます。
	 * @throws IllegalAccessException
	 */
	before() throws IllegalAccessException : register() && !canRegister() {
		throw new IllegalAccessException();
	}
	
}
