package collections_3;


//public class Wrapper {
//	
//	private Object object;
//	
//	public void set(Object object) {
//		this.object= object;
//	}
//	
//	public Object get() {
//		return object;
//	}
//}

// ���׸� Ÿ�� Ŭ���� Wrapper
// Ÿ���� ��Ÿ�ӿ� ����
public class Wrapper<E> {
	
	private E object;
	
	public void set(E object) {
		this.object= object;
	}
	
	public E get() {
		return object;
	}
}