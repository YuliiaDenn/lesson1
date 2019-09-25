package lesson1;

public class SteeringWheel {

	Wheels wheels = new Wheels();
	

	public void turnLeft(){
		System.out.println("Helm turn left");
			wheels.turnLeft();
		
	}
	
	public void turnRight(){
		System.out.println("Helm turn right");
			wheels.turnRight();
		
	}

}
