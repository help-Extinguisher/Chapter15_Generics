package ch15_generics;

public class FrultBox {
	public static void main(String[] args) {

		
		// ������ڸ� �������
		AppleBox aBox = new AppleBox();
		
		// ���������ڸ� �������
		OrangeBox oBox = new OrangeBox();
		
		
		
		// ���ڿ� ���� ����. set.�ϸ� Apple or ������� �����µ� �̰� �� ������ �ޱ�� �߱� ���� 
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		
		
//		 ���ڿ��� ���� ������.
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		
		
		System.out.println(ap); // = ap.toString�ѰŶ� �Ȱ���
		System.out.println(og);
	}

}
