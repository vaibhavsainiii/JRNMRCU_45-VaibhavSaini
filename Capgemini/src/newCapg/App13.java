package newCapg;

import java.util.Arrays;
import java.util.Scanner;

class Graduate {
	private int id;
	private String name;
	private int marks[];

	public Graduate(int id, String name, int marks[]) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public void getGraduateInfo() {

		System.out.println("id is: " + id + " name is: " + name);

		System.out.println("Marks are:" + Arrays.toString(marks));

	}

}

class GraduateBO {

	private static final int DIVISION_VALUE = 6;

	public static int getTotalMarks(Graduate graduate) {

		int marks[] = graduate.getMarks();

		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		return sum;
	}

	public static double getAverage(Graduate graduate) {
		return getTotalMarks(graduate) / DIVISION_VALUE;
	}
}

public class App13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Howmany graudates details want to store::");
		int noOfGraduates = scanner.nextInt();

		Graduate graduates[] = new Graduate[noOfGraduates];

		for (int i = 0; i < noOfGraduates; i++) {

			System.out.println("Enter Graduate-" + (i + 1) + " id,name,marks:");
			int id = scanner.nextInt();
			String name = scanner.next();
			int marks[] = new int[6];
			for (int j = 0; j < 6; j++) {
				marks[j] = scanner.nextInt();
			}

			Graduate graduate = new Graduate(id, name, marks);

			graduates[i] = graduate;

		}

		for (int i = 0; i < graduates.length; i++) {

			graduates[i].getGraduateInfo();

			System.out.println("Total : " + GraduateBO.getTotalMarks(graduates[i]));
			System.out.println("Average : " + GraduateBO.getAverage(graduates[i]));
		}

	}
}