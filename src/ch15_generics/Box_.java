package ch15_generics;


//	 ���� �����̵��� �� ������ �ִ� �ڽ�.

public class Box_<T> {
	
	// �����̵� ������ �ִ� ����.
	private T ob; // ������Ʈ ���� T��� ������ Ÿ������ ���ش� (�̸� ����������)
	
	// ���ñ� ���
	public void set(T o) {
		ob = o;
	}
	
	
	// ���ñ� ����
	public T get() {
		return ob;
	}

}
