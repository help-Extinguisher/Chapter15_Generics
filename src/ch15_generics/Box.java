package ch15_generics;


//	 ���� �����̵��� �� ������ �ִ� �ڽ�.

public class Box {
	
	// �����̵� ������ �ִ� ����. �� ������� Object�� �ھƼ� ���ɻ��ڷ� �����
	private Object ob;
	
	// ���ñ� ���
	public void set(Object o) {
		ob = o;
	}
	
	
	// ���ñ� ����
	public Object get() {
		return ob;
	}

}
