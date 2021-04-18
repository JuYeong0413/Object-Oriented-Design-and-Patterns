// 2016111540 ¿Ã¡÷øµ

package bridge.pattern.test;
import bridge.pattern.GreenColor;
import bridge.pattern.Pentagon;
import bridge.pattern.RedColor;
import bridge.pattern.Shape;
import bridge.pattern.Triangle;

public class TestBridgePattern {

	public static void main(String[] args) {
		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		
		Shape pentagon = new Pentagon(new GreenColor());
		pentagon.applyColor();
	}
}
