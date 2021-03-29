package q5;

public class Square extends Rectangle {
	public Square() { super(); }
	
	public Square(int size) {
		super(size, size);
	}
	
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}
	
	public void setWidth(int width) {
		this.height = width;
		this.width = width;
	}
}
