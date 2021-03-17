package newCapg;

import java.util.*;

class NStudents {

	int id;
	String name;
	String group;
	int[] marks = new int[6];

	NStudents(int id, String name, String group, int[] marks) {
		this.id = id;
		this.name = name;
		this.group = group;
		this.marks = marks;
	}

}

public class Enter {
	public static void main(String args[]) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		n = scanner.nextInt();
		enterMarks(n);
		scanner.close();
	}

	static void enterMarks(int n) {
		int high = 0, low = 600;
		Scanner scanner = new Scanner(System.in);
		
		NStudents obj[] = new NStudents[n];
		for (int i = 0; i < n; i++) {
			
			System.out.println("Enter Id");
			int id = scanner.nextInt();
			System.out.println("Enter name:");
			String name = scanner.next();
			System.out.println("Enter group:");
			String group = scanner.next();
			int marks[]=new int[6];
			System.out.println("Enter Marks in 6 subjects:");
			for (int j = 0; j < marks.length; j++) {
				marks[j] = scanner.nextInt();
			}
			obj[i]=new NStudents(id,name,group,marks);
		}
		for (int i = 0; i < n; i++) {
			int total = 0;
			System.out.println("Total marks for student" + i + " : ");
			for (int j = 0; j < 6; j++) {
				total += obj[i].marks[j];
			}
			System.out.println(total);
			System.out.println("Average= " + total / 6);
			if (total > high) {
				high = total;
			}
			if (total < low) {
				low = total;
			}

		}
		System.out.println("Highest marks: "+high);
		System.out.println("Lowest marks: "+low);
		scanner.close();
	}

	
}