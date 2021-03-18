package multithreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {
	public static void main(String[] args) {
		ReaderExercise t = new ReaderExercise();
		t.run();
	}
}

class ReaderExercise implements Runnable {
	static int counter = 0;

	@Override
	public void run() {
		FileReader fr;
		FileWriter fw;
		int i;
		try {
			fr = new FileReader("D:\\Java Capg\\Capgemini\\source.txt");
			fw = new FileWriter("D:\\Java Capg\\Capgemini\\target.txt",true);

			try {
				while ((i=fr.read()) != -1) {
					
					System.out.print((char)i);
					fw.write((char)i);
					fw.flush();
					counter++;
					if (counter == 11)

					{
						System.out.println("10 characters added");
						counter = 1;
						Thread.sleep(1000);
					}
				}
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			System.out.println("File Not found exception");
		}
	}

}
