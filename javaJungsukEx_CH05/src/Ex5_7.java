
public class Ex5_7 {

	public static void main(String[] args) {
		// 1.커맨드 라인을 통해 입력받기(공백문자로 구분하므로 입력될 값에 공백이 있으면 ""로 감싸주어야 한다. 
		//   숫자도 문자열로 처리된다.)
		// C:\JAVA\java-study3\javaJungsukEx_CH05>java MainTest abc 123 "Hello world"
		// 2.이클립스에서 커맨드 라인 매개변수 입력하기
		// Run > Run Configurations > (x)= Arguments > Program Arguments에 
		// abc 123 "Hello world" 를 입력했음
		System.out.println("매개변수의 개수 : "+ args.length);
		for(int i= 0; i < args.length; i++) {
			System.out.println("args["+ i+ "]= \""+ args[i] + " \"");
		}
	}
}
