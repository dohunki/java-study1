
public class Ex5_6 {
	
	public static void main(String[] args) {
		// String�迭�� �ʱ�ȭ
//		String[] names= new String[] 
//		names[0]= "kim";
//		names[1]= "Park";
//		names[2]= "Yi";
		// �Ʒ��� ���� ������ �ʱ�ȭ�� �� �ִ�.
		String[] names= new String[] {"kim", "Park", "Yi"};
//		String[] names= {"kim", "Park", "Yi"}; // new String[] ���� ����
		
		for(int i= 0; i < names.length; i++)
			System.out.println("names[" +i +"]:"+ names[i]);
		
		String tmp= names[2];
		System.out.println("tmp: "+ tmp);
		names[0]= "Yu";
		
		for(int i= 0; i < names.length; i++)
			System.out.println(names[i]);

	}

}
