package throwing_exception2_5;

public class App {

	public static void main(String[] args) {
		Thermostat stat= new Thermostat();
		
		try {
			stat.setTemperature(36);
		} catch (Exception e) {
			// �µ� ���� �߻�
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
