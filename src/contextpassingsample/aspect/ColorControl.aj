package contextpassingsample.aspect;

import contextpassingsample.figure.ColorControllingClient;
import contextpassingsample.figure.Figure;
import contextpassingsample.figure.FigureElement;

public aspect ColorControl {

	/**
	 * ColorControllingClientが実行しているすべてのメソッド
	 * @param client
	 */
	pointcut CCClientCflow(ColorControllingClient client) : cflow(call(* *(..)) && target(client));
	
	pointcut make() : call(FigureElement Figure.make*(..));
	
	after(ColorControllingClient client) returning (FigureElement fe) : make() && CCClientCflow(client) {
		fe.setColor(client.colorFor(fe));
	}
	
}
