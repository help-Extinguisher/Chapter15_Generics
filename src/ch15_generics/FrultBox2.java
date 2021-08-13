package ch15_generics;

public class FrultBox2 {
	public static void main(String[] args) {
		
		// 만능상자를 만들었따
		Box aBox = new Box();
		Box oBox = new Box();
		
		// 만능상자에 과일 담기
		aBox.set(new Apple()); // 자동으로 형변환 되었음
		oBox.set(new Orange());
		
		
		
		
		// 상자에서 과일 꺼내기. 꺼낼때 강제형변환만 해주면 문제없어진다
//		Apple ap = aBox.get(); // 오브젝트 타입으로 들어갔으므로 강제 형변환을 해줘야함
		Apple ap = (Apple) aBox.get(); // 앞에 강제형변환을 해줬다! (애플 붙인거)
		Orange og = (Orange) oBox.get();
		
		
		
		System.out.println(ap); // = ap.toString한거랑 똑같음
		System.out.println(og);
	}

}
