package decorator;

public class ChineseFood extends FoodDecorator {

	public ChineseFood(Food f) {
		super(f);
	}
	
	@Override
	public void cook() {
		super.cook();
		System.out.println("Veg Food With Fried Rice and Manchurian");
	}
	
	@Override
	public double getPrice() {
		double price = super.getPrice() + 115.0;
		return price;
	}

}
