package java_Api;

import java.util.StringTokenizer;

public class Ex_3 {

	public static void main(String[] args) {
		// �Է� ���ڿ�
		String str= "ġŲ,����,����,����,�ʹ�,������,������";
		String delim= ","; // ������
//		System.out.println(str.toString());
		
//		1.�����ڸ� ","�� �ϴ� StringTokenizer �����Ͻÿ�.
		
		StringTokenizer st= new StringTokenizer(str, delim); 
		
		//2.��� ��ū�� ����Ͻÿ�.
		while(st.hasMoreTokens()) { // ��ū�� �����Ѵٸ� �ݺ�
			System.out.println(st.nextToken());
		}
		
//		for(i= 0; i< st. ??; i++) {
//			System.out.println(st.nextToken());
//		}
	}

}
