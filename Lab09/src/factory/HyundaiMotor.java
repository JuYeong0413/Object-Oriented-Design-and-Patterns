// 2016111540 이주영

package factory;

public class HyundaiMotor extends Motor {
	
   protected void moveMotor(Direction direction) {
      System.out.println("move Hyundai Motor " + direction);
   }
}
