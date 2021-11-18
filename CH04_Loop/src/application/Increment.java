package application;

public class Increment {

	public static void main(String[] args) {
		// 증가 감소 연산자
		int count= 0;
		
		count= count+ 1;  // 1씩 증가
		System.out.println(count);
		count+= 1;		// 1씩 증가, c-= 2 => c= c-2
		System.out.println(count);
		count++;		// 1씩 증가
		System.out.println(count);
		++count;		// 1씩 증가
		System.out.println(count);
		
		// 위의 4가지 방법으로 1씩 감소 시켜라.
		count= count- 1;  // 1씩 감소
		System.out.println(count);
		count-= 1;		// 1씩 감소, c-= 2 => c= c-2
		System.out.println(count);
		count--;		// 1씩 감소
		System.out.println(count);
		--count;		// 1씩 감소
		System.out.println(count);

	}

}
