package decorator;

public class FoodDecorator implements Food {
	
	protected Food food;
	
	public FoodDecorator(Food f) {
		this.food = f;
	}

	@Override
	public void cook() {
		this.food.cook();
	}

	@Override
	public double getPrice() {
		return this.food.getPrice();
	}

}
