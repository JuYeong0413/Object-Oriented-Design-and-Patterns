package q3;

public class LightBulb implements ElectricDevice {

	@Override
	public void turnOn() {
		System.out.println("LightBulb: Bulb turned on...");
	}

	@Override
	public void turnOff() {
		System.out.println("LightBulb: Bulb turned off...");
	}

}
