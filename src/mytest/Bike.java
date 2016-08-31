package mytest;

public class Bike {
	private double speed;
	private int color;

	Bike() {
		System.out.println("Bike()");
		color= 3;
	}
	Bike(int c) {
		System.out.println("Bike()");
		color= c;
	}

	void upSpeed() {
		speed = (speed < 1 ? 1 : speed * 1.2);// 速度小於1時、設定等值1，然後速度乘於1.2倍
	}

	void upSpeed(int gart) {
		speed = (speed < 1 ? 1 : speed * 1.2 + (gart));
	}

	void downSpeed() {
		speed = (speed < 1 ? 0 : speed * 0.7);
	}

	double getSpeed() {
		return speed;
	}
}
