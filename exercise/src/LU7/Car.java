package LU7;

public class Car {

	private String licenseNo;
	private String colour;
	private int speed;

	public Car(String licenseNo, String colour, int speed) {
		this.licenseNo = licenseNo;
		this.colour = colour;
		this.speed = speed;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void accelerate(int x) {
		speed = speed + x;
	}

	public void brake(int x) {
		speed = speed - x;
	}

	public void honk() {
		System.out.println("Porr Porr");
	}

	public void display() {
		System.out.println("Car    : " + licenseNo);
		System.out.println("Colour : " + colour);
		System.out.println("Speed  : " + speed);
	}
}
