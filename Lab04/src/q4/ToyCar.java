package q4;

public class ToyCar implements Toy, MovingToy {
	double price;
	String color;

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() { }
	
}
