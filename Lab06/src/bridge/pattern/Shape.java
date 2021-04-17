// 2016111540 ¿Ã¡÷øµ

package bridge.pattern;

public abstract class Shape {

	protected Color color;
	
	public Shape(Color c){
		this.color = c;
	}
	
	abstract public void applyColor();
}
