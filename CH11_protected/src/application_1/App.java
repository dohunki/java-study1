package application_1;

import entities_2.Apple;
import entities_2.Banana;
import entities_2.Fruit;


public class App {
	public static void main(String[] args) {
		// ������Ʈprotected ���������� ���� �ٸ� ��Ű������ ����� �� ���� ��ӹ��� �ڽ�Ŭ�������� ��밡��
		Fruit f1= new Apple();
		// f1.id= 7;
		System.out.println(f1.toString());
		
		Fruit f2= new Banana();
		System.out.println(f2.toString());
	}

}
