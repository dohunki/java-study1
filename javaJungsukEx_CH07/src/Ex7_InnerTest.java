class AA {
	int i= 100;
	BB b= new BB();
	
	class BB {
		void method() {
//			AA a= new AA();
//			System.out.println(a.i);
			System.out.println(i);	// ��ü �������� �ܺ� Ŭ������ ��� ���ٰ���
		}
	}
}


//class CC { // �ٸ� Ŭ������ ���� Ŭ���� ��ü�� ����� �� ����.
//	BB b= new BB();
//}

public class Ex7_InnerTest {

	public static void main(String[] args) {
//		BB b= new BB();
//		b.method();
		
	}
}
