package call_vs_execution.tester;

/**
 * ポイントカットのcallとexecutionの違いを検証。
 * 
 * @author honyaryousuke
 *
 */
public class Tester {

	public static void main(String[] args){
		Tester t = new  Tester();
		System.out.println("MedhodAをmainから呼び出す");
		t.methodA();
		System.out.println("MedhodBをmainから呼び出す");
		t.methodB();
	}
	
	public void methodA(){
		System.out.println("Method A execute.");
		methodB();
	}
	
	public void methodB(){
		System.out.println("Method B execute.");
	}
}
