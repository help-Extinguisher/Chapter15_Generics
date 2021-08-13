package ch15_generics;

public class FrultBox3 {
	public static void main(String[] args) {
		
		// ���ɻ��ڸ� �������
		Box_<Apple> aBox = new Box_<Apple>(); // ��ü�� �����Ҷ� Ÿ���� �������ذ��� Box_<T>����
		Box_<Orange> oBox = new Box_<Orange>();
		
		// ���ɻ��ڿ� ���� ���
		aBox.set(new Apple()); // �ڵ����� ����ȯ �Ǿ���
		oBox.set(new Orange());
		
		
		
		
		// ���ڿ��� ���� ������.
		Apple ap = aBox.get(); // ���� ����ȯ �� �ʿ䰡 ���� (Apple) ���°Ű���
		Orange og = oBox.get();
		
		
		
		System.out.println(ap); // = ap.toString�ѰŶ� �Ȱ���
		System.out.println(og);
	}

}
