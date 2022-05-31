package Classes;

public class MovieMain {

	public static void main(String[] args) {


		Movie newMovie = new Movie("Joker", 2018);
		
		newMovie.changeYearReleased(2019);
		newMovie.info();
		
	}

}
