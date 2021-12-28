package member;

// 빈즈는 테이블에 레코드 단위에 값을 저장하는 객체 덩어리 컬럼 단위에 값을 넣고 가져가는 기능 뿐이다.
// 빈즈클래스명 : 1.테이블+Bean => ZipcodeBean
public class ZipcodeBean {
	
	// 2.private 데이터타입 컬럼명
	private String zipcode;
	private String area1;
	private String area2;
	private String area3;
	

	// 3.getter, setter 선언 (getZipcode, setZipcode)
	// 게터, 세터는 자동생성을 이용(오타의 위험이 없다.)
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		// 변수명 앞에 this를 붙이면 필드를 뜻함
		this.zipcode = zipcode;
	}
	public String getArea1() {
		return area1;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public String getArea2() {
		return area2;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	

}
