package timer_example_5;

import java.util.Timer;

import java.util.TimerTask;

class Task extends TimerTask{
	@Override
	public void run() {
		System.out.println("Çï·Î¿ì!");
	}
}

public class App {

	public static void main(String[] args) {

		Timer timer= new Timer();
		timer.scheduleAtFixedRate(new Task(), 0L, 1000L);
	}
}
