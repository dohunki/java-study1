package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 참조 자료형, 참조변수(reference variable)은 주솟값을 가진다.
		// 문자열은 크기를 알 수가 없으므로 
		String text= null; // null값은 주솟값이 없다는 것
		// int x= null; 기본 자료형에는 null값을 입력불가(null값은 주소가 없다는 뜻)
		text= new String("헬로우");
		// text= "헬로우";
		
		// int는 4byte로 정해져 있므므로 int x= 10; 로 표현 가능하지만,
		// String은 크기를 알 수 없을므로 String text= "헬로우"; 로 표현하지 않는다.
		
		System.out.println(text);
		
		String[] texts= null;
		System.out.println(texts);
		texts= new String[3]; // 배열 문자열 3칸을 실제 생성해서 texts에 주소입력
		System.out.println(texts);
		System.out.println(texts[0]);
		
		texts[0]= new String("하이!");
		texts[1]= "안녕?";
		texts[2]= "굿바이!";
		
		for(String w : texts) {
			System.out.println(w);
		}
		

	}

}
