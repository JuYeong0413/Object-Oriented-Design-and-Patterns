package decorator;

public class VegeFood implements Food {

	@Override
	public void cook() {
		System.out.println("Veg Food");
	}
	
	@Override
	public double getPrice() {
		return 50.0;
	}

}
