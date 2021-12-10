package java_Api;

import java.util.ArrayList;

/*
 * ��Ʈ������ ����(49900��), ���� �����(58900��), ����Ŀ��(46900��)
 * ��ٱ��� ������ ������ ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
 */
public class Ex_4 {

	public static void main(String[] args) {
		// 1.���� ��ǰ ��ü�� �����Ͻÿ�.
		ArrayList<Item> list= new ArrayList<Item>();
		
		//2.��ٱ��Ͽ� ��ǰ�� �����ÿ�.
		Cart myCart= new Cart();
		myCart.add(new Item("��Ʈ������ ����", 49900));
		myCart.add(new Item("���� �����", 58900));
		myCart.add(new Item("����Ŀ��", 46900));
		
		// ���� ���
		System.out.printf("����: %d��", myCart.totalPrice());
	}
}

class Cart {
	private ArrayList<Item> list;
	public Cart() {
		this.list= new ArrayList<Item>();
	}
	public void add(Item item) {
		list.add(item);
	}
	
	// 3.��ٱ��� ���� �޼��带 �ϼ��Ͻÿ�.
	public int totalPrice() {
		int sum= 0;
		for(int i=0; i< list.size(); i++) {
			sum += list.get(i).getPrice();
		}
		
		return sum;
	}
}

class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name= name;
		this.price= price;		
	}
	
	public int getPrice() {
		return price;
	}
}