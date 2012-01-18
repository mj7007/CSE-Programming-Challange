package Test;

public class Van implements Vehicle {

	public void brake() {
		System.out.println("Van is breaking");
	}

	public void pressHorn() {
		System.out.println("Van is now pressing the Horn");
	}

	public void start() {
		System.out.println("van is starting");
	}
	
	public static void main(String args[]){
		Car car_1 = new Car();
		Van van_1 = new Van();
		
		car_1.start();
		car_1.brake();
		van_1.start();
		car_1.pressHorn();
		van_1.brake();
	}

}
