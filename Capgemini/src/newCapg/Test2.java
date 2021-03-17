package newCapg;
public class Test2 {
int a=15;

static
{
	
	System.out.println("C");
}

public Test2()
{		System.out.println("B");

	}
void print()
{		System.out.println("D");

	}

	public static void main(String arghs[])
	{
		
		int x=20;
		System.out.println("A");
		Test2 test=new Test2();
		test.print();
	}
	
	}