

//	class Testclass{
//		void instanceMethod() {}  		// �ν��Ͻ��޼���
//		static void staticMethod() {} 	// static�޼���
//		
//		void instnaceMethod2() { 	//�ν��Ͻ��޼���
//			instanceMethod(); 		// �ٸ� �ν��ͽ��޼��带 ȣ���Ѵ�.
//			staticMethod();	  		// static�޼��带 ȣ���Ѵ�.
//		}
//		
//		static void staticMethod2() { // static�޼���(�׻� ȣ�� ����)
////			instanceMethod(); 		// ����!! �ν��Ͻ��޼��带 ȣ���� �� ����.
//			// iv�� �۾��ϴ� �޼���(iv�� ���), ��ü�� �ʿ�
//			staticMethod();	  		// static�޼���� ȣ���� �� �ִ�.
//		}
//	} // end of class
	// ���� Ŭ���� ���� �޼���� ���� ��ü�� �����̳� �������� ���� ���� ȣ���� ���������� 
	// static�޼���� �ν��Ͻ� �޼��带 ȣ���� �� ����.
	
//	class TestClass2 {
//		int iv;			// �ν��Ͻ� ����(��ü ���� �� ��밡��)
//		static int cv;  // Ŭ���� ����(������ ��밡��)
//		
//		void instnaceMethod() {		 // �ν��Ͻ� �޼���(��ü ������ ȣ�Ⱑ��)
//			System.out.println(iv);	 // �ν��Ͻ� ������ ����� �� �ִ�.
//			System.out.println(cv);	 // Ŭ���� ������ ����� �� �ִ�.
//		}
//		
//		static void staticMethod() { // static�޼���
////			System.out.println(iv);	 // ����!! �ν��Ͻ� ������ ����� �� ����.
//			System.out.println(cv);	 // Ŭ���� ������ ����� �� �ִ�.
//		}
//	} // end of class
	// �ν��Ͻ� �޼���� �ν��Ͻ� ������ ����� �� ������, static�޼���� �ν��Ͻ� ������ ����� �� ����.

