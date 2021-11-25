package returnValue_4;

public class App {
	public static void main(String[] args) {
		// 리턴값이 있는 메서드 사용 
		ReturnMethod r1= new ReturnMethod();
		
		String cat= r1.getAnimal();
		// 함수 r1.getAnimal(); 를 실행(sop가 일단 실행)하고 리턴값을 cat에 저장 
				
		System.out.println("캣 변수는 : "+ cat);

	}

}
