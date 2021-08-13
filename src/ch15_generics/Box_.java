package ch15_generics;


//	 무슨 과일이든지 다 담을수 있는 박스.

public class Box_<T> {
	
	// 무엇이든 담을수 있는 상자.
	private T ob; // 오브젝트 말고 T라는 임의의 타입으로 써준다 (미리 정하지말고)
	
	// 뭐시기 담아
	public void set(T o) {
		ob = o;
	}
	
	
	// 뭐시기 꺼내
	public T get() {
		return ob;
	}

}
