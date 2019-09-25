package lesson1;

public class Ignition {

	Engine engine = new Engine();
	Wheels wheels = new Wheels();

	public void ignitionKeyIsOn() {
		System.out.println("Ignition key is On");
		engine.engineOn();
		wheels.wheelsSpin();

	}

	public void ignitionKeyIsOff() {
		System.out.println("Ignition key is Off");
		engine.engineOff();
		wheels.wheelsStop();
	}
}
