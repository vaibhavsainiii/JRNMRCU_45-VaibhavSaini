package stringsAndParsing;

import java.time.*;
import java.util.*;

public class Exercise9 {
	static void findDifference(LocalDate start_date, LocalDate end_date) {

		Period diff = Period.between(start_date, end_date);

		System.out.print("Difference " + "between two dates is: ");

		System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
	}

	public static void main(String[] args) {
		LocalDate start_date = LocalDate.of(2018, 01, 10);
		LocalDate end_date = LocalDate.of(2020, 06, 10);

		findDifference(start_date, end_date);
	}

}
