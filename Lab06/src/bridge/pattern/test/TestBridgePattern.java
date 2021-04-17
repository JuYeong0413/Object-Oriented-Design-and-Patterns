// 2016111540 ¿Ã¡÷øµ

package bridge.pattern.test;
import bridge.pattern.GreenColor;
import bridge.pattern.Pentagon;
import bridge.pattern.RedColor;
import bridge.pattern.Shape;
import bridge.pattern.Triangle;

public class TestBridgePattern {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}
}
