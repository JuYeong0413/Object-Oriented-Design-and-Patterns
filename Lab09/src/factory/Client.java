// 2016111540 이주영

package factory;

public class Client {

    public static void main(String[] args) {
//       Motor lgMotor = new LGMotor();
       MotorFactory factory = new MotorFactory();
       Motor lgMotor = factory.createMotor(VendorID.LG);
       ElevatorController controller1 = new ElevatorController(1, lgMotor);
       controller1.gotoFloor(5);
       controller1.gotoFloor(3);

//       Motor hyundaiMotor = new HyundaiMotor();
       Motor hyundaiMotor = factory.createMotor(VendorID.HYUNDAI);
       ElevatorController controller2 = new ElevatorController(1, hyundaiMotor);
       controller2.gotoFloor(4);
       controller2.gotoFloor(6);
       
    }
 }
