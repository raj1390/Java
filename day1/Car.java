package week1.day1;

public class Car {
	
	public void driveCar() {
		System.out.println("drive car");
		}
	public void applyBrake() {
		System.out.println("apply brake");
	}
	public void soundHorn() {
		System.out.println("sound horn");
	}
	public void isPuncture() {
		System.out.println("is puncture");
	}
	
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.driveCar();
		obj.applyBrake();
		obj.soundHorn();
		obj.isPuncture();
		
	}

}
