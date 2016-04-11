package annotationbasedstyle.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import annotationbasedstyle.figure.FigureElement;

@Aspect
public class FigureElementLogger {

	@Before("call(void FigureElement.move())")
	public void beforeMoveLog(){
		System.out.println("start move.");
	}
	
	@After("call(void FigureElement.move())")
	public void afterMoveLog(){
		System.out.println("end move.");
	}
	
}
