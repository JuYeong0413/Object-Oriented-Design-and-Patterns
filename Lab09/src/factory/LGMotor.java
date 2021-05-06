// 2016111540 이주영

package factory;

public class LGMotor extends Motor {
	
   protected void moveMotor(Direction direction) {
      System.out.println("move LG Motor " + direction);
   }
}
