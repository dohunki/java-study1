class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int를 String으로 변환한다.
//		String strVal = iVal+ "";
		
		double dVal = 200.0;
		String strVal2 = dVal + "";	// int를 String으로 변환하는 또 다른 방법
		
		System.out.println(strVal);
		System.out.println(strVal2);
//		System.out.println(strVal+"+"+strVal2+"="+sum2); // 문자열이어서 에러

		// 부호는 허용, 공백제거 메서드 trim() 사용을 권장
		double sum  = Integer.parseInt("+"+strVal.trim()) 
                                          + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2.trim());
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}
}