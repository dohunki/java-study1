package java_Api;

import java.util.ArrayList;

public class Ex_1 {
	public static void main(String[] args) {
		// ArrayList ����
		ArrayList<Chicken> order= new ArrayList<Chicken>();
		
		// �ֹ��� ġŲ�� ArrayList�� �߰��Ͻÿ�.
		order.add(new Chicken("�ν�Ʈ ġŲ", 9900));
		order.add(new Chicken("�Ĵ� ġŲ", 12900));
		order.add(new Chicken("���þ� ġŲ", 13900));
		
		// 2.ArrayList�� ��ȸ�Ͽ� ������ ���Ͻÿ�.
		int sum= 0;

		for(int i=0; i< order.size(); i++) {
			sum += order.get(i).getPrice();
		}
		
		// ��� ���
		System.out.printf("����: %d��\n", sum);
	}
}

class Chicken {
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		this.name= name;
		this.price= price;
	}
	
	public int getPrice() {
		return price;
	}
}