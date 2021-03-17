package io;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Test {

	public static void main(String args[])
	{
		
		
		
	    Date date = new Date();  
	    SimpleDateFormat 
        sdfo 
        = new SimpleDateFormat("yyyy-MM-dd"); 

    try {
		Date d1 = sdfo.parse("2018-03-31");
		if(d1.before(date))
		{
			System.out.println("date 1 is bigger");
		}
		
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	
}}
