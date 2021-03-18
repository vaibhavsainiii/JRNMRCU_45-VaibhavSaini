package multithreading;

import java.util.Timer;


public class Exercise2 {

	static int counter = 0;
	static Timer timer;

	public static void main(String[] args) {
		TimerExercise t = new TimerExercise();
		t.run();
	}
}

class TimerExercise implements Runnable {

	int counter = 1;

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(500);
				System.out.println(counter++);
				System.out.flush();
				Thread.sleep(500);
				if (counter == 11) {
					System.out.println("Counter will reset");
					counter = 1;
					Thread.sleep(10000);
					run();
				}

			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

	}
}
