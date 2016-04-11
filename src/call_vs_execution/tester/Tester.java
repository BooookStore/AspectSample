package call_vs_execution.tester;

/**
 * ポイントカットのcallとexecutionの違いを検証。
 * 
 * @author honyaryousuke
 *
 */
public class Tester {
	
	static final int recursiveAmount = 3;

	public static void main(String[] args){
		Tester t = new  Tester();
		System.out.println("MedhodAをmainから呼び出す");
		t.methodA();
		System.out.println("MedhodBをmainから呼び出す");
		t.methodB();
		System.out.println("MethodCをmainから呼び出す");
		t.methodC(0);
	}
	
	public void methodA(){
		System.out.println("Method A execute.");
		methodB();
	}
	
	public void methodB(){
		System.out.println("Method B execute.");
	}
	
	public void methodC(int count){
		if(count >= recursiveAmount) return;
		System.out.println("Method C execute.");
		methodC(count + 1);
	}
}
