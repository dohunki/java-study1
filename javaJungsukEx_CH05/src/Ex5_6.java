
public class Ex5_6 {
	
	public static void main(String[] args) {
		// String배열의 초기화
//		String[] names= new String[] 
//		names[0]= "kim";
//		names[1]= "Park";
//		names[2]= "Yi";
		// 아래와 같이 간단히 초기화할 수 있다.
		String[] names= new String[] {"kim", "Park", "Yi"};
//		String[] names= {"kim", "Park", "Yi"}; // new String[] 생략 가능
		
		for(int i= 0; i < names.length; i++)
			System.out.println("names[" +i +"]:"+ names[i]);
		
		String tmp= names[2];
		System.out.println("tmp: "+ tmp);
		names[0]= "Yu";
		
		for(int i= 0; i < names.length; i++)
			System.out.println(names[i]);

	}

}
