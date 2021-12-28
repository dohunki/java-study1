import java.util.StringJoiner;

class Ex9_9 {
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr   = animals.split(",");	

		for(int i= 0; i< 3; i++) {
			System.out.println(arr[i]);	
		}
		
		System.out.println(String.join("-", arr));

		/*
		 * public StringJoiner(CharSquence delimiter) {
		 * 		this(delimiter, "", ""); // this(±¸ºÐÀÚ, prefix, suffix);
		 * }
		 */
		StringJoiner sj = new StringJoiner("/","[","]");

		for(String s : arr)
			sj.add(s);
		
		System.out.println(sj.toString());
		
		
		StringJoiner sj1 = new StringJoiner("~","(",")");

		for(String s : arr)
			sj1.add(s);
		
		System.out.println(sj1.toString());
	}
}