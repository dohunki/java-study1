package custom_exception_7;

import custom_exception_7.exceptions.TempOutOfRangeException;
import custom_exception_7.exceptions.TempTooHighException;
import custom_exception_7.exceptions.TempTooLowException;

public class App {
	public static void main(String[] args) throws TempOutOfRangeException {
		Thermostat stat= new Thermostat();
		
		try {
			stat.setTemperature(-36);
		} catch (TempTooHighException e) {
			// �µ��� ���� ��
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// �µ��� ���� ��
			System.out.println(e.getMessage());
		}
	}
}
