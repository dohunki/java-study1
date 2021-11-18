package integerVariable;

public class PrintOutput {

	public static void main(String[] args) {
		// 문자열 + 숫자 => 문자열
		int x= 5; 
		int y= 7;
		int z= x+ y;
		
		System.out.println("x+y의 값은 : " +z);
		
		String s= "x+y의 값은 : " +z;
		
		System.out.println(s);
		
		double a= 3.14;
		double b= 2.16;
//		int k= a+ b;  // 에러가 난다. 다른 타입에 입력할 수 없다.
		double c= a+b;
		System.out.println(c);
	}

}
