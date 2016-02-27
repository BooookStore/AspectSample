
public aspect Greet {
	
	pointcut greet() : call(* Messenger.message(..));
	
	before() : greet() {
		System.out.print("Hello,");
	}
	
}
