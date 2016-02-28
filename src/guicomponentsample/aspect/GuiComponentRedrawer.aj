package guicomponentsample.aspect;

import guicomponentsample.component.GuiComponent;
import guicomponentsample.component.Scrollbar;

public aspect GuiComponentRedrawer {

	/**
	 * GuiComponentの各プロパティが変化するメソッドコールへのポイントカット
	 * @param gui
	 */
	pointcut changeForm(GuiComponent gui) : 
		(call(void GuiComponent+.set*(..)) || call(void Scrollbar.moveThumb())) &&
		target(gui);

	/**
	 * GuiComponentのredrawメソッドを呼び出す
	 * @param gui
	 */
	after(GuiComponent gui) : changeForm(gui) {
		gui.redraw();
	}
	
}
