package ch15_generics;



/**
 * 사과를 담는 상자
 *  
 **/

public class AppleBox {
	
	
	private Apple ap;
	
	
	// 사과를 담음
	public void set(Apple a) {
		ap = a;
	}
	
	// 사과를 꺼냄
	public Apple get() {
		return ap; 
	}

	
}
