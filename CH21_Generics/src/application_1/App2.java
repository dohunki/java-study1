package application_1;

import collections_3.Pair;
import hierarchy_2.Cat;
import hierarchy_2.Creature;
import hierarchy_2.Mammal;

public class App2 {
	public static void main(String[] args) {
		Pair<Integer, Cat> pair= new Pair<>(1, new Cat("��ƿ��"));
		
		System.out.println(pair);
		
		System.out.println(pair.getOne());
		System.out.println(pair.getTwo());
		
		Pair<Creature, Mammal> pair2= new Pair<>(new Creature("����"), new Mammal("������"));
		
		System.out.println(pair2);
		
	}

}
