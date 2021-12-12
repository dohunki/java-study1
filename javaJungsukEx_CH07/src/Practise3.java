
/*
 * 캡슐화와 접근 제어자
 * -접근제어자는 클래스 내부의 데이터를 보호하기 위해 외부로부터의 접근을 제한하려고 사용한다.
 *  이것을 데이터 감추기(data hiding)라고 하며, 객체지향개념의 캡슐화에 해당된다.
 *  또, 외부에는 불필요한 클래스 내에서만 사용되는(내부작업을 위해 임시로 사용되는 멤버변수나 부분작업을 처리하기 위한 메서드 등)
 *  멤버들을 클래스 내부에 감추기 위해 사용된다.  
 */

class Time {
	// 접근 제어자를 private으로 하여 외부에서 직접 접근하지 못하도록 한다.
	// 메서드를 통한 간접 접근 허용
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() { return hour; }
	public void setHour(int hour) {
		if (hour< 0 || hour> 23) return;
		this.hour= hour;
	}
	
	public int getMinute() { return minute; }
	public void setMinute(int minute) {
		if (minute< 0 || minute> 59) return;
		this.minute= minute;
	}
	
	public int getSecond() { return second; }
	public void setSecond(int second) {
		if (second< 0 || second> 59) return;
		this.second= second;
	}
	
	/*
	 * -get으로 시작하는 메서드는 단순히 멤버변수의 값을 반환하는 일을 하고, set으로 시작하는 메서드는 
	 *  매개변수에 지정된 값을 검사하여 조건에 맞는 값일 때에만 멤버변수의 값을 변경하도록 작성되어 있다.
	 * -상속을 통해 확장될 것이 예상되는 클래스라면 멤버에 접근 제한을 주되 자손클래스에서 접근하는 것이
	 *  가능하도록 하기 위해 private 대신 protected를 사용한다.
	 * -보통 멤버변수의 값을 읽는 메서드의 이름을 'get멤버변수이름'으로 하고, 멤버변수의 값을 변경하는
	 *  메서드의 이름을 'set멤버변수이름'으로 한다. get으로 시작하는 메서드를 '겟터(getter)', 
	 *  set으로 시작하는 메서드를 '셋터(setter)'라고 부른다.
	 */
}


public class Practise3 {
	public static void main(String[] args) {
		Time t= new Time();
//		t.hour= 25; // 에러. 접근제한
		t.setHour(25); // true, 밖으로 빠져나가 Data를 보호
		t.setHour(21); // false, 
		t.setMinute(36);
		t.setSecond(50);
		
		System.out.println(t.getHour()+"시" + t.getMinute()+"분" +t.getSecond()+ "초");
		System.out.printf("%d시 %d분 %d초", t.getHour(), t.getMinute(), t.getSecond() );
		
		// 
	}
}
