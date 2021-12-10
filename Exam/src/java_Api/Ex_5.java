package java_Api;

import java.util.ArrayList;

/*
 * 김밥(2000원)*57개, 돈까스(6000원)*29개, 냉면(5000원)*34개을 이용하여
 * 총매출을 계산하는 프로그램을 작성하여라.
 */
public class Ex_5 {

	public static void main(String[] args) {
		// 1.메뉴 객체를 생성하시오.
		ArrayList<Menu> list= new ArrayList<Menu>();
		
		// 2.스토어 객체를 만들 후 위의 메뉴들을 추가하시오.
		Store store= new Store();
		store.add(new Menu("김밥", 2000, 57));
		store.add(new Menu("돈까스", 6000, 29));
		store.add(new Menu("냉면", 5000, 34));
		
		// 3.하루 총 매출을 계산하시오.
		
		System.out.printf("총 매출: %d원", store.totalSales());
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
	
	// 4.총 매출액 계산 메서드를 만드시오.
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
	
	// 5.price의 게터를 만드시오.
	public int getPrice() {
		return price;
	}
	// 6.count의 게터를 만드시오.
	public int getCount() {
		return count;
	}
}
