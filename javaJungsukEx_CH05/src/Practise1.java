import java.util.Arrays;

public class Practise {
	public static void main(String[] args) {
		int[] iArr1= new int[]{100, 95, 80, 70, 60};
		for(int i=0; i< iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		
		System.out.println();
		
		int[] iArr2= new int[] {100, 95, 80, 70, 60};
		System.out.println(Arrays.toString(iArr2));
	}
	

}
