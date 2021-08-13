package ch15_generics;

public class FrultBox {
	public static void main(String[] args) {

		
		// 사과상자를 만들었따
		AppleBox aBox = new AppleBox();
		
		// 오렌지상자를 만들었따
		OrangeBox oBox = new OrangeBox();
		
		
		
		// 상자에 과일 담음. set.하면 Apple or 어륀지만 나오는데 이건 그 형으로 받기로 했기 때문 
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		
		
//		 상자에서 과일 꺼내기.
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		
		
		System.out.println(ap); // = ap.toString한거랑 똑같음
		System.out.println(og);
	}

}
