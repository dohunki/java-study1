package throwing_exception_4;

public class Thermostat {
	// 예외처리 throws는 해당 예외처리를 이 메서드를 호출할 때 처리하도록 함
	public void setTemperature(double temperature) throws Exception {
		
		if(temperature < 0 || temperature > 35) {
			throw new Exception("온도가 비정상 입니다."); // 새 예외를 생성, 예외처리를 throws Exception를 이용
		}
		
		System.out.println("온도 세팅 : "+ temperature);
	}

}
