package LU6;

//Worksheet 6 Practice 1

//Exercise 1
public class Video_W6_P1 {
	
	String title;
	int length;
	boolean avail;
	
	public Video_W6_P1(String title, int length, boolean avail) {
		super();
		this.title = title;
		this.length = length;
		this.avail = avail;
	}
	
	public void displayInfo() {
		System.out.println("title field from Video class: " + title);
		System.out.println("length field from Video class: " + length);
		System.out.println("avail field from Video class: : " + avail);
	}
}
