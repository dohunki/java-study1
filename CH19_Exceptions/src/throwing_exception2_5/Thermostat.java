package throwing_exception2_5;

public class Thermostat {
	// ����ó�� throws�� �ش� ����ó���� �� �޼��带 ȣ���� �� ó���ϵ��� ��
	public void setTemperature(double temperature) throws Exception {
		
		setMachineTemperatuer(temperature);
		System.out.println("�µ� ���� : "+ temperature);
		
	}
	
	private void setMachineTemperatuer(double temperature) throws Exception {
		if(temperature < 0 || temperature > 35) {
			throw new Exception("�µ��� ������ �Դϴ�."); // �� ���ܸ� ����, ����ó���� throws Exception�� �̿�
		}
	}

}
