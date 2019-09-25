package lesson1;

public class Car {

	Ignition ignition = new Ignition();
	SteeringWheel helm = new SteeringWheel();

	public void startedUp() {
		System.out.println("The car started up and rides");
		ignition.ignitionKeyIsOn();
	}

	public void turnLeft() {
		System.out.println("The car turn left");
		helm.turnLeft();
	}

	public void turnRight() {
		System.out.println("The car turn right");
		helm.turnRight();
	}

	public void stopped() {
		System.out.println("The car stopped");
		ignition.ignitionKeyIsOff();
	}
}
