package application;

public class PreAndPost {

	public static void main(String[] args) {
		// ���������� ++ -- ��ġ�� �ٸ� ���
		// �ڿ� ���� ��� ���� ����ϰ� ����, �տ� ���� ��� ���� �����ϰ� ���
		int x= 5;
		System.out.println(x++);
		System.out.println(x);
		
		int y= 3;
		System.out.println(++y);
		
		int z= 10;
		int sum= x+ z--;
		System.out.println(sum);
		System.out.println(z);
		
		int apples= 5;
		int bananas= 4;
		int fruits= ++apples+ bananas++;
		System.out.println(apples);
		System.out.println(bananas);
		System.out.println(fruits);
		

	}

}
