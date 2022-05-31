package LU4_Classes;

public class Movie {

	public String movieTitle;
	public int yearReleased;

	public Movie(String movieTitle, int yearReleased) {
		this.movieTitle = movieTitle;
		this.yearReleased = yearReleased;
	}

	public void changeYearReleased(int yr) {
		this.yearReleased = yr;
	}

	public void info() {
		System.out.println("Movie Title: " + movieTitle);
		System.out.println("Year Released: " + yearReleased);
	}

}
