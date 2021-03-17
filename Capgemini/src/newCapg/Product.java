package newCapg;

import java.util.Scanner;

public class Product
{
	 Long id;
	 String productName;
	 String supplierName;
	 
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
	 void getDetails()
	 {
		 System.out.println("Product id is " +this.id+ "\nProduct name is " +this.productName+ "\nSupplier name is "+this.supplierName);
	 }
	 
	 public static void main(String args[])
		{
			doSomething();
			
		}
	static void doSomething()
	{
		Product obj=new Product();
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE PRODUCT ID:");
		long id=scanner.nextInt();
		obj.setProductId(id);
		System.out.println("ENTER THE PRODUCT NAME :");
		String productName=scanner.next();
		obj.setProductName(productName);
		System.out.println("ENTER THE SUPPLIER NAME :");
		String supplierName=scanner.next();
		obj.setSupplierName(supplierName);
		scanner.close();
		obj.getDetails();
	}
	
}


	
	 

