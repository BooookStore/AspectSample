package GuiComponentSample.GuiComponentAspect;

import GuiComponentSample.GuiComponent.GuiComponent;
import GuiComponentSample.GuiComponent.*;

public aspect GuiComponentRedrawer {

	pointcut changeForm(GuiComponent gui) : 
		(call(void GuiComponent+.set*(..)) || call(void Scrollbar.moveThumb())) &&
		target(gui);

	after(GuiComponent gui) : changeForm(gui) {
		gui.redraw();
	}
	
}
