package ch15_generics;

public class FrultBox3 {
	public static void main(String[] args) {
		
		// 만능상자를 만들었따
		Box_<Apple> aBox = new Box_<Apple>(); // 객체를 생성할때 타입을 지정해준거임 Box_<T>에서
		Box_<Orange> oBox = new Box_<Orange>();
		
		// 만능상자에 과일 담기
		aBox.set(new Apple()); // 자동으로 형변환 되었음
		oBox.set(new Orange());
		
		
		
		
		// 상자에서 과일 꺼내기.
		Apple ap = aBox.get(); // 강제 형변환 할 필요가 없다 (Apple) 쓰는거같이
		Orange og = oBox.get();
		
		
		
		System.out.println(ap); // = ap.toString한거랑 똑같음
		System.out.println(og);
	}

}
