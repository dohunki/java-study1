package interface_inheritance_3;

// 인터페이스끼리 상속가능
public interface DefaultRunnable extends Runnable{
//	void displayDetails()  // (가)
	default void displayDetails() { // default가 붙으면 메서드 구현가능
		System.out.println("표시할 디테일 없음");
	};

}
