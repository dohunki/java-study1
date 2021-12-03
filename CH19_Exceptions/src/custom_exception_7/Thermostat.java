package custom_exception_7;

import custom_exception_7.exceptions.TempOutOfRangeException;
import custom_exception_7.exceptions.TempTooHighException;
import custom_exception_7.exceptions.TempTooLowException;

public class Thermostat {
	// ����ó�� throws�� �ش� ����ó���� �� �޼��带 ȣ���� �� ó���ϵ��� ��
	public void setTemperature(double temperature) throws TempOutOfRangeException  {
		
		setMachineTemperature(temperature);
		System.out.println("�µ� ���� : "+ temperature);	
	}
	
	private void setMachineTemperature(double temperature) throws TempTooLowException, TempTooHighException {
		if(temperature < 0 ) {
			throw new TempTooLowException("�µ��� �ʹ� �����ϴ�.."); 
		}
		else if (temperature > 35) {
			throw new TempTooHighException("�µ��� �ʹ� �����ϴ�.."); 
		}
	}
}
