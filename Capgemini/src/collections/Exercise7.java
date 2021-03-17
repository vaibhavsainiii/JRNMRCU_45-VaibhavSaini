package collections;

public class Exercise7 {

	static int[] sortStrings(int arr[]) {

		String[] arr1 = new String[arr.length];
		int temp;
		for (int i = 0; i < arr.length; i++) {
			String rev = "";
			arr1[i] = String.valueOf(arr[i]);
			for (int j = arr1[i].length()-1; j >= 0; j--) {
				rev = rev + arr1[i].charAt(j);

			}
			arr1[i] = rev;

		}
		
		for (int i = 0; i < arr1.length; i++)
		{
			arr[i]=Integer.valueOf(arr1[i]);  
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;

	}
	
	public static void main(String args[])
	{
		int arr[]= {231,543,232,132,434,232};
		int[] arr1=new int[arr.length];
		arr1=sortStrings(arr);
		
		for(int i=0;i<arr1.length;i++)
		System.out.println(arr1[i]);
		
	}
}
