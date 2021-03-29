package q01;

public class Circle implements AreaCalculator {
	public double radius;

	@Override
	public double calculateArea() {
		return (22/7)*radius*radius;
	}
}
