package member;

// ����� ���̺� ���ڵ� ������ ���� �����ϴ� ��ü ��� �÷� ������ ���� �ְ� �������� ��� ���̴�.
// ����Ŭ������ : 1.���̺�+Bean => ZipcodeBean
public class ZipcodeBean {
	
	// 2.private ������Ÿ�� �÷���
	private String zipcode;
	private String area1;
	private String area2;
	private String area3;
	

	// 3.getter, setter ���� (getZipcode, setZipcode)
	// ����, ���ʹ� �ڵ������� �̿�(��Ÿ�� ������ ����.)
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		// ������ �տ� this�� ���̸� �ʵ带 ����
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
