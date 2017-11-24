package computrade.puzzle.array;

import static org.junit.Assert.*;

import org.junit.Test;


public class StockMaximumProfitTest {
	
	@Test
	public void testStockMaximumProfitException() {
		
		try {
			double stockPrices[] = { 100 };
			StockMaximumProfit.findBestProfit(stockPrices);
		    fail( "My method didn't throw when I expected it to" );
		} catch (IllegalArgumentException expectedException) {
		}
	}
	
	@Test
	public void testStockMaximumProfit2num() {
		
		double stockPrices[] = { 100, 100.2 };	
		assertEquals(0.2,StockMaximumProfit.findBestProfit(stockPrices),0.001);
	
	}
	
	@Test
	public void testStockMaximumProfit3num() {
		
		double stockPrices[] = { 100, 100.2, 101 };
		assertEquals(1,StockMaximumProfit.findBestProfit(stockPrices),0.001);
	
	}
	
	@Test
	public void testStockMaximumProfit4num() {
		
		double stockPrices[] = { 100, 100.2, 99, 98 };
		assertEquals(0.2,StockMaximumProfit.findBestProfit(stockPrices),0.001);
	
	}
	
	@Test
	public void testStockMaximumProfit5Num() {
		
		double stockPrices[] = { 100, 100.2, 99, 98, 103 };
		assertEquals(5,StockMaximumProfit.findBestProfit(stockPrices),0.001);
	
	}

	@Test
	public void testStockMaximumProfitRandomNum() {
		
		double stockPrices[] = { 100, 100.2, 99, 98, 97.1, 99, 96,
				101.2, 102.3, 104.1, 103.2 };
		assertEquals(8.1,StockMaximumProfit.findBestProfit(stockPrices),0.001);
	
	}
	
	@Test
	public void testStockMaximumProfitInteger() {
		
		double stockPrices[] = { 100, 99, 101, 98, 102 };
		assertEquals(4,StockMaximumProfit.findBestProfit(stockPrices),0.001);
	
	}
	
	
}
