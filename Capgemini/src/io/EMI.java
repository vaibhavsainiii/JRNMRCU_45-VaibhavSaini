package io;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;

public class EMI {
	 
    public static void main(String args[])throws Exception{
   
       String date=getDate();
//        cal.add(date.MONTH, -20);
//        System.out.println("date before 5 months : " + getDate(cal));
     
        
    }
 
    public static String getDate()throws Exception{
    	System.out.println("Enter a date in yyyy-MM-dd format");
    	Scanner scanner=new Scanner(System.in);
    	String date=scanner.next();
    	System.out.println(date);

    	Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(date);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate=((DateFormat) date1).format(myFormatObj);
    	System.out.println(date1);

        return date;
    }
 
    
 
}

