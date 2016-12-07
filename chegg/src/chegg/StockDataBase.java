package chegg;

import java.util.Arrays;

public class StockDataBase {
	Double[] stock = new Double[366];

	public Double getStock(Integer day) {
		return stock[day];
	}

	public void setStock(Integer day,Double value) {
		stock[day]=value;
	}

	
	public Double[] getStock() {
		return stock;
	}

	public StockDataBase() {
		Arrays.fill(stock, new Double(0));
	}

}
