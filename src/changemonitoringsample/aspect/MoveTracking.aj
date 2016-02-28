package changemonitoringsample.aspect;

import changemonitoringsample.figures.*;
import java.util.concurrent.atomic.AtomicBoolean;

public aspect MoveTracking {
	
	private static AtomicBoolean dirty = new AtomicBoolean();
	
	public static boolean testAndClear(){
		return dirty.getAndSet(false);
	}
	
	pointcut move() : 
		call(void FigureElement.setXY(int,int)) ||
		call(void Line.setP1(int,int)) ||
		call(void Line.setP2(int,int)) ||
		call(void Point.setX(int)) ||
		call(void Point.setY(int));
	
	after() : move(){
		dirty.set(true);
	}
	
}
