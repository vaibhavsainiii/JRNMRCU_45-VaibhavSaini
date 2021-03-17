package flow.control;

import java.util.Scanner;

public class SortString {

	static void Sort(String str) 
	{
		char arr[] = str.toCharArray();
		int size=arr.length;
		char temp;
		for (int i = 0; i < size ; i++)
		arr[i]=Character.toLowerCase(arr[i]);
		for (int i = 0; i < size ; i++) 
        { 
			for(int j=i+1;j<size;j++)
        	{
        
           if(arr[i]>arr[j])
           {
        	   temp=arr[i];
        	   arr[i]=arr[j];
        	   arr[j]=temp;
           }
          
           
        	}
        
        }
        for(int i = 0; i < size ; i ++) 
        {
        	
        	if(i<(size+1)/2)
        	{
        		arr[i]=Character.toUpperCase(arr[i]);
        	}
        	else
        		arr[i]=Character.toLowerCase(arr[i]);
        	
        	System.out.println(arr[i]);
        }
        
        
	}
		
		public static void main(String args[])
		{
			Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a STRING : ");
	        String num = scanner.nextLine(); 
	        Sort(num);
	        scanner.close();
		}
}

