package decorator;

public class NonVegeFood extends FoodDecorator {

	public NonVegeFood(Food f) {
		super(f);
	}
	
	@Override
	public void cook() {
		super.cook();
		System.out.println("Veg Food With Roasted Chicken and Chicken Curry");
	}
	
	@Override
	public double getPrice() {
		double price = super.getPrice() + 200.0;
		return price;
	}

}
