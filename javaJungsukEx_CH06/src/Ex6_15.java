class Ex6_15 {
	/*
	 * 명시적 초기화를 통해 배열 arr을 생성하고, 클래스 초기화 블럭을 이용해서 배열의
	 * 각 요소들을 random()을 사용해서 임의의 값을 채우도록 한다.
	 */
	static int[] arr = new int[10]; // 명시적 초기화

	static { // 클래식 초기화 블럭
		for(int i=0;i<arr.length;i++) {
			// 1과 10사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}

	public static void main(String args[]) {
		for(int i=0; i<arr.length;i++)
			System.out.println("arr["+i+"] :" + arr[i]);
	}
}