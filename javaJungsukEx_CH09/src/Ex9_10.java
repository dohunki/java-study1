class Ex9_10 {
	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal); // int�� String���� ��ȯ�Ѵ�.
//		String strVal = iVal+ "";
		
		double dVal = 200.0;
		String strVal2 = dVal + "";	// int�� String���� ��ȯ�ϴ� �� �ٸ� ���
		
		System.out.println(strVal);
		System.out.println(strVal2);
//		System.out.println(strVal+"+"+strVal2+"="+sum2); // ���ڿ��̾ ����

		// ��ȣ�� ���, �������� �޼��� trim() ����� ����
		double sum  = Integer.parseInt("+"+strVal.trim()) 
                                          + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2.trim());
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		System.out.println(strVal+"+"+strVal2+"="+sum2);
	}
}