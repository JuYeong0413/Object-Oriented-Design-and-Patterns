package command;

public class SellStockOrder implements Order {
	
	private StockTrade stock;
	
	SellStockOrder(StockTrade stock) {
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
	}

}
