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
			// 온도가 높을 때
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// 온도가 낮을 때
			System.out.println(e.getMessage());
		}
	}
}
