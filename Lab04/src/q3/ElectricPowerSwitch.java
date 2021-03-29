package q3;

public class ElectricPowerSwitch {
	private ElectricDevice device;
	public boolean on;
	
	public ElectricPowerSwitch(ElectricDevice device) {
		this.device = device;
		this.on = false;
	}
	
	public boolean isOn() {
		return this.on;
	}
	
	public void press() {
		boolean checkOn = isOn();
		if (checkOn) {
			device.turnOff();
			this.on = false;
		} else {
			device.turnOn();
			this.on = true;
		}
	}
}
