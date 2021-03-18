package newCapg;
package newCapg;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class ProfitLossTester {

	ProfitLoss pl;
	public static void main(String[] args){
	      ProfitLossTester tester = new ProfitLossTester();
	      tester.setUp();
	      System.out.println(tester.testValue()?"pass":"fail");
	   }
	
	 private boolean testValue() {
		 test=mock(ProfitLoss.class);
		return false;
	}

	public void setUp(){
	      pl = new ProfitLoss();		
	  
	     pl = mock(ProfitLoss.class);		
	  
	      p1.setStockService(stockService);
	   }
}




public class PortfolioTester {
	
   Portfolio portfolio;	
   StockService stockService;
	   
   
   public static void main(String[] args){
      PortfolioTester tester = new PortfolioTester();
      tester.setUp();
      System.out.println(tester.testMarketValue()?"pass":"fail");
   }
   
  
   
   public boolean testMarketValue(){
    	   
      List<Stock> stocks = new ArrayList<Stock>();
      Stock googleStock = new Stock("1","Google", 10);
      Stock microsoftStock = new Stock("2","Microsoft",100);	
 
      stocks.add(googleStock);
      stocks.add(microsoftStock);

      portfolio.setStocks(stocks);

      //mock the behavior of stock service to return the value of various stocks
      when(stockService.getPrice(googleStock)).thenReturn(50.00);
      when(stockService.getPrice(microsoftStock)).thenReturn(1000.00);		

      double marketValue = portfolio.getMarketValue();		
      return marketValue == 100500.0;
   }
}