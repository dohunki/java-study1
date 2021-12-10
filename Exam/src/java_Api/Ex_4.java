package java_Api;

import java.util.ArrayList;

/*
 * 스트라이프 셔츠(49900원), 슬림 면바지(58900원), 스니커즈(46900원)
 * 장바구니 내역의 총합을 구하는 프로그램을 완성하시오.
 */
public class Ex_4 {

	public static void main(String[] args) {
		// 1.구매 상품 객체를 생성하시오.
		ArrayList<Item> list= new ArrayList<Item>();
		
		//2.장바구니에 상품을 담으시오.
		Cart myCart= new Cart();
		myCart.add(new Item("스트라이프 셔츠", 49900));
		myCart.add(new Item("슬림 면바지", 58900));
		myCart.add(new Item("스니커즈", 46900));
		
		// 총합 출력
		System.out.printf("총합: %d원", myCart.totalPrice());
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
	
	// 3.장바구니 총합 메서드를 완성하시오.
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