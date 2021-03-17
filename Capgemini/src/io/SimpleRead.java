package io;
import java.io.*;

public class SimpleRead {

	public static void main(String args[]) throws Exception
	{
		FileReader fr=new FileReader("test.txt");
		int i; 
	    while ((i=fr.read()) != -1) 
	      System.out.print((char) i); 
	}
}
