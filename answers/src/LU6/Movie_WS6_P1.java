package LU6;

//Worksheet 6 Practice 1

//Exercise 1
public class Movie_WS6_P1 extends Video_W6_P1 {

	String director;
	double rating;
	
	public Movie_WS6_P1(String title, int length, boolean avail, String director, double rating) {
		super(title, length, avail);
		this.director = director;
		this.rating = rating;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("director field from Movie class: " + director);
		System.out.println("rating field from Movie class: " + rating);

	}
}
