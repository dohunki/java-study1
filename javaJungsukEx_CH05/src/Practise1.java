import java.util.Arrays;

public class Practise1 {
	public static void main(String[] args) {
		int[] iArr1= new int[]{100, 95, 80, 70, 60};
		for(int i=0; i< iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		
		System.out.println();
		
		// Array.toString()�� ����Ͽ� �迭 ����ϱ�(import java.util.Arrays; �� �߰��ؾ� �Ѵ�)
		int[] iArr2= {100, 95, 80, 70, 60}; // new int[] ��������
		System.out.println(Arrays.toString(iArr2));
		
		System.out.println();
		
		// String Ŭ������ char�迭�� ���(�޼���)�� �߰��� ���̴�.
		// String��ü(���ڿ�)�� ���� ���� ���� �� ������ ������ ���� ����.
		// �Ʒ� ������ ���ڿ� str�� ������ ����� ���� �ƴ϶�, ���ο� ������ ���ڿ��� ������ ���̴�.
		String str= "Java";
		str= str+ "8";
		System.out.println(str);
		
		System.out.println();
		
		// char charAt(int index)�� ���ڿ����� �ش� ��ġ(index)�� �ִ� ���ڸ� ��ȯ�Ѵ�.
		String str1= "ABCDE";
		char ch= str1.charAt(3);
		System.out.println(ch);
		
		System.out.println();
		
		// int length()�� ������ ���̸� ��ȯ�Ѵ�.
		String str2= "abcdefg";
		int i= str2.length();
		System.out.println(i);
		
		System.out.println();
		
		// String substring(int from, int to)�� ���ڿ����� �ش������ ���ڿ��� ��ȯ�Ѵ�.(to�� ���� �� ��)
		String str3= "01234567";
		String i2= str3.substring(2, 5);
		System.out.println(i2);
		
		System.out.println();
		
		// char[] toCharArray()�� ���ڿ��� ���ڹ迭(char[])�� ��ȯ�ؼ� ��ȯ�Ѵ�.
		String str4= "���ڹ迭��ȯ";
		char[] c= str4.toCharArray();
		System.out.println(c);
		System.out.println(c[3]);
		
		System.out.println();
		
		
		
	}
}
