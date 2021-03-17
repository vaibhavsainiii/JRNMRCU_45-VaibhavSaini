package stringsAndParsing;

import java.util.*;

public class Exercise5 {
	static void countText(String text) {
		String[] lineStr = text.split("\\.");
		int lines = lineStr.length;
		int wordCount = 0;
		int charCount = 0;
		for (int i = 0; i < lines; i++) {
			String[] wordStr = lineStr[i].split(" ");
			wordCount = wordCount + wordStr.length;
			for (int j = 0; j < wordStr.length; j++) {
				charCount = charCount + wordStr[j].length();
			}
		}
		System.out.println("No. of lines: " + lines);
		System.out.println("NO. of Words: " + wordCount);
		System.out.println("No. of characters: " + charCount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a text");
		String s = scanner.nextLine();
		countText(s);
		scanner.close();
	}
}