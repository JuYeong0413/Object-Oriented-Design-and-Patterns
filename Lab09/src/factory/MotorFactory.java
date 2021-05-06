// 2016111540 이주영

package factory;

public class MotorFactory {
	public Motor createMotor(VendorID vendorID) {
		Motor motor = null;

		switch (vendorID) {
			case LG:
				motor = new LGMotor();
				break;
			case HYUNDAI:
				motor = new HyundaiMotor();
				break;
		}
		
		return motor;
	}
}
