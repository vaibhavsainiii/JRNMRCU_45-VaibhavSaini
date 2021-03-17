package inheritance.and.polymorphism;
import java.util.Scanner;

class Shape {

	protected String shapeName;
	
	double calculateArea()
	{
		return 0;
	}
	
	Shape(String shapeName)
	{
		this.shapeName=shapeName;
	}
	
	
}

class Square extends Shape{
	int side;
	
	double calculateArea()
	{
		return side*side;
	}
	
	Square(int side)
	{
		super("Square");
		this.side=side;
		
	}
}

class Rectangle extends Shape{
	int length,breadth;
	
	double calculateArea()
	{
		return length*breadth;
	}
	
	Rectangle(int length,int breadth)
	{
		super("Rectangle");
		this.length=length;
		this.breadth=breadth;
		
	}
	
}

class Circle extends Shape{
	int radius;
	
	double calculateArea()
	{
		return (3.14*radius*radius);
	}
	
	Circle(int radius)
	{
		super("Circle");
		this.radius=radius;
		
	}
}

public class MainShape{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Choose your shape: ");
		System.out.println("1. Rectange\n2. Square\n3. Circle");
		int a=scanner.nextInt();
		if(a==1)
		{
			System.out.println("enter length and breadth ");

			int length=scanner.nextInt();
			int breadth=scanner.nextInt();
			Rectangle rectangle=new Rectangle(length, breadth);
			System.out.println(rectangle.calculateArea());
		}
		if(a==2)
		{
			System.out.println("enter side ");

			int side=scanner.nextInt();
			Square square=new Square(side);
			System.out.println(square.calculateArea());
		}
		if(a==3)
		{
			System.out.println("enter radius");

			int radius=scanner.nextInt();
			Circle circle=new Circle(radius);
			System.out.println(circle.calculateArea());
		}
		
	}
	
}
