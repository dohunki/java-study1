class Outer2 {
	class InstanceInner { // �ν��Ͻ� ���
		int iv = 100;
	}

	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}

	void myMethod() {
		class LocalInner {
			int iv = 400;
		}
	}
	
//	void myMethod2() {
//		// ���� �̸��� Ŭ������ �޼��帶�� ���� �� �ִ�.
//		class LocalInner {
//			int Iv= 100;
//		}
//	}
}

class Ex7_15 {
	public static void main(String[] args) {
		// ���� Ŭ������ �ν��Ͻ��� �����Ϸ��� �ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ� �Ѵ�.
		Outer2 oc = new Outer2(); // �ܺ� Ŭ������ ��ü ����
		Outer2.InstanceInner ii = oc.new InstanceInner(); // ���� Ŭ������ ��ü ����

		System.out.println("ii.iv : "+ ii.iv);
		System.out.println("Outer2.StaticInner.cv : "+Outer2.StaticInner.cv);
												// �ܺ�Ŭ������ ��ü�������� cv ��밡��
                                     
		// static ���� Ŭ������ �ν��Ͻ��� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		// ������, �ܺ�Ŭ���� �̸��� �ٿ���� �Ѵ�.
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : "+ si.iv);
	}
}