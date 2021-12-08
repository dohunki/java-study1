package application_1;

import collections_3.Wrapper;
import hierarchy_2.Cat;
import hierarchy_2.Creature;
import hierarchy_2.Mammal;

public class App {
	public static void main(String[] args) {
//		Wrapper wrapper= new Wrapper();	
		// ���׸� Ÿ�� (Wrapper.java�� �����Ͽ� ���Ͻÿ�.) 
		Wrapper<Cat> wrap1= new Wrapper<>();
		
		Wrapper<Creature> wrap2= new Wrapper<>();
		Wrapper<Mammal> wrap3= new Wrapper<>();	
		
		Cat cat= new Cat("��ƿ��");
		Creature cr= new Creature("ũ����");
		Mammal mam= new Mammal("������");
		
//		wrapper.set(cat);		
		// ���׸� Ÿ��
		wrap1.set(cat);
		
		wrap2.set(cr);
		wrap3.set(mam);

//		Cat c1= (Cat)wrapper.get();
		// Wrapper.java���� return�� Object�̱� ������ (����Ŭ����)����ȯ (Cat)
				// ���׸� Ÿ��
		Cat c1= wrap1.get();
		
		Creature c2= wrap2.get();
		Mammal m2= wrap3.get();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m2);
	}

}
