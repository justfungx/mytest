package mytest;

public class java23 {

	public static void main(String[] args) {
		Bike myBike = new Bike();
		Bike urBike = new Bike();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed();
		System.out.println(myBike.getSpeed());
		myBike.upSpeed(60);
		System.out.println(myBike.getSpeed());
	}

}
