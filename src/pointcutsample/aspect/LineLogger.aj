package pointcutsample.aspect;

import java.util.logging.Level;
import java.util.logging.Logger;

import pointcutsample.figures.Line;

public aspect LineLogger {
	
	/**
	 * Lineクラス内で、他のクラスのメソッド呼び出し
	 */
	pointcut lineMethodCalled() : call(* *.*(..)) && within(Line);
	
	before() : lineMethodCalled() {
		Logger.getLogger("LINE").log(Level.INFO,"Line instance other instance method call.");
	}
	
	/**
	 * Lineのgetter,setterメソッドが呼び出される
	 */
	pointcut recivedCall() : target(pointcutsample.figures.Line) && (call(* set*(..)) || call(* get*()));
	
	before() : recivedCall() && !adviceexecution(){
		System.out.println("Target : " + thisJoinPoint.getTarget());
		System.out.println("This : " + thisJoinPoint.getThis());
		System.out.println("Signature : " + thisJoinPoint.getSignature());
	}
}
