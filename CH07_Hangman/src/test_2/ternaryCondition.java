package test_2;

public class ternaryCondition { // 삼항 조건 연산자

	public static void main(String[] args) {
		// 조건? A : B  (조건이 참이면 A 아니면 B 이다.)
		System.out.println(true? "참":"아님");
		System.out.println(false? "참":"아님");
		
		int n= 99;
		n= n> 100? 100 : n; // 100보다 크면 100 출력, 아니면 n 출력
		System.out.println(n); 
		
		int[] values= {6, 3, 92, 64, 17};
		
		// for문 이용
		int max= 0; // 최댓값
		for(int val : values) {
			if(val > max) {
				max= val; // 최댓값보다 val가 크면 val값을 최댓값에 넣는다.
			}
		}
		
		// 삼항연산자 이용
		int min=100; // 최솟값
		for(int val : values) {
			min= val< min? val : min;	
		}
		System.out.println(max);
		System.out.println(min);

	}

}
