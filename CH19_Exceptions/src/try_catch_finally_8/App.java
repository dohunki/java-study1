package try_catch_finally_8;

public class App {

//	public static void main(String[] args) throws Exception {
	public static void main(String[] args)  {

		Person p1= new Person();
		
		try {
			p1.setName(null);
//			p1.setName("펭수");			
			System.out.println("예외 발생시 여기는 실행안됨");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			// 여기는 예외 발생여부와 관계없이 반드시 실행됨
			System.out.println("finally 무조건 실행");
		}
		
		System.out.println("프로그램 종료");

	}

}
