/*
 * 객체 자신을 가리키는 참조변수 : this
 * -생성자의 매개변수로 인스턴스변수들의 초기값을 제공받는 경우가 많기 때문에 매개변수와 인스턴스변수의 이름이 
 * 일치하는 경우가 자주 있다. 이때 매개변수 이름을 다르게 하는 것보다 'this'를 사용해서 구별하도록 하는 것이
 * 의미가 더 명확하고 이해하기 쉽다.
 * -'this'는 참조변수로 인스턴스 자신을 가리킨다. 참조변수를 통해 인스턴스의 멤버에 접근할 수 있는 것처럼,
 * 'this'로 인스턴스변수에 접근할 수 있다. 
 * -하지만 'this'를 사용할 수 있는 것은 인스턴스멤버뿐이다. static메서드에서는 인스턴스멤버를 사용할 수 
 * 없는 것처럼 'this' 역시 사용할 수 없다.
 * -생성자를 포함한 모든 인스턴스메서드에는 자신이 관련된 인스턴스를 가리키는 참조변수 'this'가 지역변수로
 * 숨겨진 채로 존재한다.
 *  this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 내장되어 있다.
 *  	   모든 인스턴스에 지역변수로 숨겨진 채로 존재한다.
 *  this(), this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다.
 */
public class Practise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
}

class Car3 {
	String color;
	String gearType;
	int door;
	
	Car3(){}
	
	Car3(String c, String g, int d) {
		color= c; // color는 iv, c는 lv
		// this.color= c; 에서 this가 생략되어 있는 것이다.
		gearType= g;
		door= d;
	}	
}

class Car4 {
	String color;
	String gearType;
	int door;
	
	Car4(){}
	
	Car4(String color, String gearType, int door) {
		this.color= color;
		this.gearType= gearType;
		this.door= door;
	}	
}