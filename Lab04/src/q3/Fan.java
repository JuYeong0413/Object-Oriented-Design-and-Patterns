package q3;

public class Fan implements ElectricDevice {

	@Override
	public void turnOn() {
		System.out.println("Fan: Fan turned on...");
	}

	@Override
	public void turnOff() {
		System.out.println("Fan: Fan turned off...");
	}
	
}
