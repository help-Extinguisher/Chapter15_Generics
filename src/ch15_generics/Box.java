package ch15_generics;


//	 무슨 과일이든지 다 담을수 있는 박스.

public class Box {
	
	// 무엇이든 담을수 있는 상자. 그 조상격인 Object를 박아서 만능상자로 만든다
	private Object ob;
	
	// 뭐시기 담아
	public void set(Object o) {
		ob = o;
	}
	
	
	// 뭐시기 꺼내
	public Object get() {
		return ob;
	}

}
