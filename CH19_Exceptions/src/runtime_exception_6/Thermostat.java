package runtime_exception_6;

public class Thermostat {
	// runtime ���ܴ� ����ó���� ���� �ʾƵ� �ȴ�.
	public void setTemperature(double temperature) {
		
		if(temperature < 0 || temperature > 35) {
			throw new RuntimeException("�µ��� ������ �Դϴ�."); // �� ���ܸ� ����
		}
		
		System.out.println("�µ� ���� : "+ temperature);
	}

}
