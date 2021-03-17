package io;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;  
public class StringToDate {
	public static void main(String[] args) {  
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a date in Month dd, yyyy format");
	    String date=scanner.next();
	    DateConverter obj=new DateConverter();
	    obj.convert(date);
	    
}
}

	class DateConverter{
		void convert(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
	   
	    	LocalDate date1 = LocalDate.parse(date,formatter);  
	        System.out.println("Date is: "+date1); 
	}
		}
