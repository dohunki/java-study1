package school_12;

public class App {

	public static void main(String[] args) {
		// 학생 객체 만들기
		Student s1= new Student("펭수", 7);
		Student s2= new Student("길동", 37);
		Student s3= new Student("라이온", 17);
		Student s4= new Student("타이거", 27);
		
		s1.setVisible(false); // 펭수, 원격, 온도측정 안함
		s2.setTemperature(35.5); // 길동, 집체, 온도 35.5
		s3.setTemperature(36.5); // 라이온, 집체, 온도 36.5
		s4.setVisible(false); // 타이거, 원격, 온도측정 안함
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		

	}

}
