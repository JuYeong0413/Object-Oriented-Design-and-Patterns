package q01;

public class Rectangle implements AreaCalculator {
	public double length;
	public double width;
	
	@Override
	public double calculateArea() {
		return length*width;
	}
}
