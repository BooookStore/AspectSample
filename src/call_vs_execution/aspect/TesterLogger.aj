package call_vs_execution.aspect;

import call_vs_execution.tester.Tester;

public aspect TesterLogger {

//	/**
//	 * executionとwithincodeを組み合わせたポイントカットの作成例。
//	 * Tester.methodA内にて、Tester.methodBが呼ばれた時にアドバイスをウェーブする。
//	 */
//	pointcut logTarget() : execution(void Tester.methodB()) && withincode(void Tester.methodB());
//	
//	before() : logTarget() {
//		System.out.print("\t[execution と within　の組み合わせ]");
//		System.out.println("\t" + thisJoinPoint.getSourceLocation().getLine());
//	}
	
	/**
	 * executionを使ったポイントカットの例。
	 * 
	 */
	pointcut logTargetSecond() : execution(void Tester.methodB());
	
	before() : logTargetSecond() {
		System.out.println("\t" +thisJoinPoint.toLongString());
	}
	
	before() : call(void Tester.methodB()) {
		System.out.println("\t" +thisJoinPoint.toLongString());
	}
	
}
