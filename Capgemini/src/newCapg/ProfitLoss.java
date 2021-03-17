package newCapg;
import java.text.DecimalFormat;
import java.util.*;
public class ProfitLoss {
	
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF DOZENS OF TOYS PURCHASED :");
		int x=scanner.nextInt();
		System.out.println("ENTER THE PRICE PER DOZEN :");
		float y=scanner.nextInt();
		System.out.println("ENTER THE SELLING PRICE OF ONE TOY :");
		float z=scanner.nextInt();
		float ans=calculateProfit(x,y,z);
		System.out.println(ans);
		scanner.close();
		
	}
	public static float calculateProfit(int dozenCount,float pricePerDozen,float sellPrice)
	{  float profit_percent=0.0f;
	
	   
	
		float cost_price=(pricePerDozen/12);
		System.out.println("Cost Price: "+cost_price);
		float profit=sellPrice-cost_price;
		System.out.println("Profit: "+profit);
		profit_percent=(profit/cost_price)*100;
		DecimalFormat df = new DecimalFormat("#.0");  
		profit_percent = Float.valueOf(df.format(profit_percent));
		System.out.println("Profit Percent: "+profit_percent);
		return profit_percent;
		
	}

}