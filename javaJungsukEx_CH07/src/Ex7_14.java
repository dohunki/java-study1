class Outer {
	private int outerIv= 0;
	private static 	int outerCv= 0;

	class InstanceInner {
		int iiv= outerIv;	// 1.����Ŭ���������� �ܺ�Ŭ������ private����� ���ٰ����ϴ�. //
		int iiv2= outerCv;
	}
	
	static class StaticInner {
//		int siv= outerIv;	// staticŬ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
		static int scv= outerCv;
	}
	
	void myMethod() { // ���� �ٲ��� �ʴ� ������ ����� ����
		int lv= 0;	// ��������(�޼��� ����� �Բ� �Ҹ�)
		// lv�� ����������, ���� �����ϴ� �ڵ尡 ������ �����δ� ����� �ٸ�����.
		final int LV= 0;	// ���. JDK1.8���� final ���� ����(�׻� �ٿ���!!)
//		lv=3;
		
		class LocalInner { // 2.���� ���� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��밡�� //
					// �ܺ� Ŭ������ ���������� final�� ���� ����(��, ���)�� ���ٰ����ϴ�. //
			int liv= outerIv;
			int liv2= outerCv;
			int liv3= lv;	// ����!!(JDK1.8���� ���� �ƴ�, lv�� �ٸ� ������ �ٲ�� ����)
			int liv4= LV;
			// �ֳ��ϸ�, ����Ŭ������ ��ü�� ������������ �� ���� ������ ���� �����Ƿ�.
			// ����� constant pool�� �־ ���� �����ϹǷ� �޼��� ����� ������� ��� ����� �� �ִ�.
		}
	}
}

public class Ex7_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
