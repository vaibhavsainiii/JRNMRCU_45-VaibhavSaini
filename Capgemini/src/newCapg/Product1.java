package newCapg;

import java.util.Scanner;

public class Product1
{
	 private Long id;
	 private String productName;
	 private String supplierName;
	 
	 void setProductId(Long id)
	 {
		 this.id=id;
	 }
	 void setProductName(String productName)
	 {
		 this.productName=productName;
	 }
	 void setSupplierName(String supplierName)
	 {
		 this.supplierName=supplierName;
	 }
	 void Display()
	 {
		 System.out.println("Product id is " +this.id+ "\nProduct name is " +this.productName+ "\nSupplier name is "+this.supplierName);
	 }
	 
	 Product1(long id,String productName, String supplierName){
		 setProductId(id);
		 setProductName(productName);
		 setSupplierName(supplierName);
	 }
	 
	 Product1()
	 {
		 setProductId(1234L);
		 setProductName("A");
		 setSupplierName("B");
		 
	 }
	 
	 public static void main(String args[])
		{
			doSomething();
			
		}
	static void doSomething()
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE PRODUCT ID:");
		long id=scanner.nextInt();
		
		System.out.println("ENTER THE PRODUCT NAME :");
		String productName=scanner.next();
		
		System.out.println("ENTER THE SUPPLIER NAME :");
		String supplierName=scanner.next();
		
		
		scanner.close();
		
		Product1 obj=new Product1(id,productName,supplierName);
		
		obj.Display();
	}
	
}


	
	 

