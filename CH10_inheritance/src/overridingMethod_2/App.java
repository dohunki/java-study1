package overridingMethod_2;

public class App {

	public static void main(String[] args) {
		// �޼��� �������̵�
		Cat cat1= new Cat();
		cat1.vocal();
		
		HouseCat cat2= new HouseCat();
		cat2.vocal();
		cat2.hunt();
		
		RoadCat cat3= new RoadCat();
		cat3.vocal();
		cat3.hunt();


	}
}
