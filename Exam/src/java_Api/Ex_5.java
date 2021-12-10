package java_Api;

import java.util.ArrayList;

/*
 * ���(2000��)*57��, ���(6000��)*29��, �ø�(5000��)*34���� �̿��Ͽ�
 * �Ѹ����� ����ϴ� ���α׷��� �ۼ��Ͽ���.
 */
public class Ex_5 {

	public static void main(String[] args) {
		// 1.�޴� ��ü�� �����Ͻÿ�.
		ArrayList<Menu> list= new ArrayList<Menu>();
		
		// 2.����� ��ü�� ���� �� ���� �޴����� �߰��Ͻÿ�.
		Store store= new Store();
		store.add(new Menu("���", 2000, 57));
		store.add(new Menu("���", 6000, 29));
		store.add(new Menu("�ø�", 5000, 34));
		
		// 3.�Ϸ� �� ������ ����Ͻÿ�.
		
		System.out.printf("�� ����: %d��", store.totalSales());
	}
}

class Store {
	private ArrayList<Menu> list;
	
	public Store() {
		this.list= new ArrayList<Menu>();
	}
	
	public void add(Menu menu) {
		list.add(menu);
	}
	
	// 4.�� ����� ��� �޼��带 ����ÿ�.
	public int totalSales() {
		int sum= 0;
		for(int i=0; i< list.size(); i++) {
		sum += list.get(i).getPrice()*list.get(i).getCount();
		}
		return sum;
	}
}

class Menu {
	private String name;
	private int price;
	private int count;
	
	public Menu(String name, int price, int count) {
		this.name= name;
		this.price= price;
		this.count= count;
	}
	
	// 5.price�� ���͸� ����ÿ�.
	public int getPrice() {
		return price;
	}
	// 6.count�� ���͸� ����ÿ�.
	public int getCount() {
		return count;
	}
}
