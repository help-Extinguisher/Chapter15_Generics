package ch15_generics;

public class FrultBox2 {
	public static void main(String[] args) {
		
		// ���ɻ��ڸ� �������
		Box aBox = new Box();
		Box oBox = new Box();
		
		// ���ɻ��ڿ� ���� ���
		aBox.set(new Apple()); // �ڵ����� ����ȯ �Ǿ���
		oBox.set(new Orange());
		
		
		
		
		// ���ڿ��� ���� ������. ������ ��������ȯ�� ���ָ� ������������
//		Apple ap = aBox.get(); // ������Ʈ Ÿ������ �����Ƿ� ���� ����ȯ�� �������
		Apple ap = (Apple) aBox.get(); // �տ� ��������ȯ�� �����! (���� ���ΰ�)
		Orange og = (Orange) oBox.get();
		
		
		
		System.out.println(ap); // = ap.toString�ѰŶ� �Ȱ���
		System.out.println(og);
	}

}
