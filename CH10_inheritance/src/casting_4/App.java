package casting_4;

public class App {

	public static void main(String[] args) {
		// ĳ���� �ǽ�
		Cat cat1= new HouseCat();
//		Cat cat1= new Cat(); // ��ü ������ �ٿ� ĳ���ð� ���� ���� ��
		
		cat1.vocal();
		cat1.hunt();
		// cat1.call(); 
		// cat1�� CatŸ���̱� ������ Cat Ŭ������ ���� �޼��� ���Ұ�, �������̵��� ��
		
		System.out.println("--------------");
		
		// �ٿ� ĳ����
		HouseCat cat2= (HouseCat)cat1; // ��ü ������ �߸��ؼ� ������ ���ܵ� 
		//��ü ������ �Ǿ�� �����Ϸ��� ������ �߰��ϹǷ� ���� ǥ�ø� ������ �ʴ´�. �ǽð� ���� �߻�
		cat2.call();
	}
}

