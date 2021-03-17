package capgemini;
import java.util.Scanner;

class IncreasingNum {
	boolean flag=true;
    public static void main(String args[]) 
    {
    	IncreasingNum obj=new IncreasingNum();
    	int num;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number : ");
        num = scanner.nextInt(); 
        obj.flag= obj.checkNum(num);
        if(obj.flag==false){
            System.out.println("Digits are not in increasing order.");
        }else{
            System.out.println("Digits are in increasing order.");
        }
        scanner.close();
    }
    
    boolean checkNum(int num)
    {

         int currentDigit = num % 10;
         num = num/10;

         while(num>0){
             if(currentDigit <= num % 10){
                 flag = false;
                 break;
             }

             currentDigit = num % 10;
             num = num/10;
         }
          
         return flag;
    }
}
