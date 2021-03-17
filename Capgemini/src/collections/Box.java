package collections;

import java.util.*;

public class Box {
	static Scanner scanner=new Scanner(System.in);
	double length,width,height;

	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	static HashSet<Object> getBox(HashSet<Object> set,int n)
	{
		long length,width,height;
		
		for(int i=0;i<n;i++)
		{
			
			System.out.println("Enter the length");
			length=scanner.nextLong();
			System.out.println("Enter the width");
			length=scanner.nextLong();
			System.out.println("Enter the height");
			length=scanner.nextLong();
			
			Box box=new Box(length,width,height);
			
			if(g1.hashCode() == g2.hashCode()) 
	        { 
	  
	            if(g1.equals(g2)) 
	                System.out.println("Both Objects are equal. "); 
	            else
	                System.out.println("Both Objects are not equal. "); 
	      
	        } 
	        else
	        System.out.println("Both Objects are not equal. ");  
		}
		
		
		
		return set;
	}
	
	public static void main(String args[])
	{
		HashSet<Object> set=new HashSet<Object>();
		System.out.println("Enter the number of boxes");
		int n=scanner.nextInt();
		set=getBox(set,n);
		
		
    }  
	}

