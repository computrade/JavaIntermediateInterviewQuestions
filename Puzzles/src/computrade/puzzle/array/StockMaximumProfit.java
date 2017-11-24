package computrade.puzzle.array;

public class StockMaximumProfit {

	public static double findBestProfit(double stockPrices[]) {
		
		if (stockPrices.length < 2) {
		        throw new IllegalArgumentException("Getting a profit requires at least 2 prices.");
		}

		double min_price = stockPrices[0];
		double max_profit = 0.0;

		for (int i = 0; i < stockPrices.length; i++) {
			double current_price = stockPrices[i];
			min_price = Math.min(min_price, current_price);
			max_profit = Math.max(max_profit, current_price - min_price);
		}
		return max_profit;
	}
}
