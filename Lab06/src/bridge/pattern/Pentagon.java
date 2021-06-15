// 2016111540 ���ֿ�

package bridge.pattern;

public class Pentagon extends Shape {

	public Pentagon(Color c) {
		super(c);
	}
	
	@Override
	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	}
}
