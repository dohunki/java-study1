package game_2.objects_3;

public class GameObject {
	private int id; // 아이디
	private String name; // 이름
	
	// 자동 생성 사용하여 만들
	protected int getId() { // 아이디 수정은 상속한 클래스에서만 사용
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override  // 원래 Object의 toString메서드는 주솟값을 나타내는데 메서드 오버라이드 함
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	}
	
	
}
