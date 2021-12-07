import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		int[] aArr1= new int[10];
		int[] aArr2= new int[10];
		int[] aArr3= {100, 95, 80, 70, 60};
		char[] chArr= {'a', 'b', 'c', 'd'};
		
		for(int i= 0; i< aArr1.length; i++) {
			aArr1[i]= i+1;
		}
		
		for(int i= 0; i< aArr2.length; i++) {
			aArr2[i]= (int)(Math.random()* 10+ 1);
		}
		
		for(int i= 0; i< aArr1.length; i++) {
			System.out.print(aArr1[i]+ ",");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(aArr2));
		System.out.println(Arrays.toString(aArr3));
		System.out.println(Arrays.toString(chArr));
		System.out.println(aArr3);
		System.out.println(chArr);
		

	}

}
