package call_vs_execution.aspect;

import call_vs_execution.tester.Tester;

public aspect TesterLogger {

	/**
	 * Tester.methodCの再帰呼び出しにウェーブ。
	 */
	before() : call(void Tester.methodC(*)) && withincode(void Tester.methodC(*)) {
		System.out.println("\t" + thisJoinPoint.toLongString());
	}
	
	/**
	 * ???なぜかウェーブしてくれない。
	 * リファレンスを見る限りではexecutionポイントカットと同じなはず。
	 */
	before() : execution(void Tester.methodB()) && withincode(void Tester.methodB()) {
		System.out.println("\t" + thisJoinPoint.toLongString());
	}
	
	/**
	 * Tester.methodBの実行時にウェーブ。
	 */
	before() : execution(void Tester.methodB()) {
		System.out.println("\t" +thisJoinPoint.toLongString());
	}
	
	/**
	 * Tester.methodBの呼び出し時にウェーブ。
	 */
	before() : call(void Tester.methodB()) {
		System.out.println("\t" +thisJoinPoint.toLongString());
	}
	
}
