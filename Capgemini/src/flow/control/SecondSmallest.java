package flow.control;

public class SecondSmallest {

	static void printSecondSmallest(int arr[]) 
    { 
        int size = arr.length,temp=0; 
  
        if (size < 2) 
        { 
            System.out.println(" Invalid Input "); 
            return; 
        } 
        
        for (int i = 0; i < size ; i++) 
        { for(int j=i+1;j<size;j++)
        {
        
           if(arr[i]>arr[j])
           {
        	   temp=arr[i];
        	   arr[i]=arr[j];
        	   arr[j]=temp;
           }
          
           
        }
        }
        for(int i = 1; i < size ; i ++) 
        System.out.println(arr[i]);
        
        for (int i = 0; i < size ; i++) 
        {
        	if(arr[i]!=arr[1])
        	{
        		temp=arr[i];
        		break;
        	}
           
        }
        
            System.out.println("the second Smallest element is " + temp ); 
    } 
	
	public static void main(String args[])
	{
		int arr[]= {1,4,1,5,6,23,3,1,1,1,1};
		printSecondSmallest(arr);
	}
  
}
