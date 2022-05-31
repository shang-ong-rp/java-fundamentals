package LU10_P2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class MovieWorld {

	private Connection conn;
	private Statement statement;
	private ResultSet rs;

	public static void main(String[] args) {

		MovieWorld mw = new MovieWorld();
		mw.start();
	}

	private void start() {

		try {
			String connectionString = "jdbc:mysql://localhost:3306/testdb";
			String userid = "c372_staff";
			String password = "P@s5w0rd!";

			conn = DriverManager.getConnection(connectionString, userid, password);
			statement = conn.createStatement();

			int option = -1;

			while (option != 4) {
				menu();
				option = Helper.readInt("Enter choice > ");

				if (option == 1) {
					viewAll();
				} else if (option == 2) {
					searchByYear();
				} else if (option == 3) {
					searchByKeyword();
				} else if (option == 4) {

					rs.close();
					statement.close();
					conn.close();

					System.out.println("Thank you for using Movie World!");
				}
			}
		} catch (SQLException se) {
			System.out.println("Error: " + se.getMessage());
		}
	}

	private void menu() {
		Helper.line(80, "=");
		System.out.println("WELCOME TO MOVIE WORLD");
		Helper.line(80, "=");
		System.out.println("1. View All Movies");
		System.out.println("2. Search for a Movie by Release Year");
		System.out.println("3. Search for a Movie by keyword");
		System.out.println("4. Quit");
	}

	private void viewAll() {
		try {
			String sql = "SELECT movie_id, title, release_date FROM movie";
			String output = String.format("%-10s %-40s %-10s\n", "MOVIE ID", "TITLE", "RELEASE DATE");

			rs = statement.executeQuery(sql);

			while (rs.next()) {
				int movieID = rs.getInt("movie_id");
				String title = rs.getString("title");
				LocalDate releaseDate = rs.getDate("release_date").toLocalDate();
				output += String.format("%-10s %-40s %-10s\n", movieID, title, releaseDate);
			}
			Helper.line(80, "-");
			System.out.println(output);

		} catch (SQLException se) {
			System.out.println("SQL Error: " + se.getMessage());
		}
	}

	private void searchByYear() {

		try {
			int year = Helper.readInt("Enter release year to search > ");
			int numReleased = 0;
			String sql = String.format("SELECT movie_id, title, release_date FROM MOVIE WHERE YEAR(release_date)= %d",
					year);
			String output = String.format("%-10s %-40s %-10s\n", "MOVIE ID", "TITLE", "RELEASE DATE");

			rs = statement.executeQuery(sql);

			while (rs.next()) {

				LocalDate releaseDate = rs.getDate("release_date").toLocalDate();
				int movieID = rs.getInt("movie_id");
				String title = rs.getString("title");
				numReleased++;
				output += String.format("%-10s %-40s %-10s\n", movieID, title, releaseDate);
			}
			output += "Total number of movies released in this year: " + numReleased;

			if (numReleased > 0) {
				Helper.line(80, "-");
				System.out.println(output);

			} else {
				System.out.println("NO MOVIES RELEASED IN THIS YEAR.");
			}
		} catch (SQLException se) {
			System.out.println("SQL Error: " + se.getMessage());
		}
	}

	private void searchByKeyword() {

		try {

			String keyword = Helper.readString("Enter keyword to search > ");

			int numFound = 0;
			String sql = "SELECT movie_id, title, release_date FROM movie WHERE title LIKE '%" + keyword + "%'";
			String output = String.format("%-10s %-40s %-10s\n", "MOVIE ID", "TITLE", "RELEASE DATE");

			rs = statement.executeQuery(sql);
			while (rs.next()) {

				LocalDate releaseDate = rs.getDate("release_date").toLocalDate();

				int movieID = rs.getInt("movie_id");
				String title = rs.getString("title");
				numFound++;
				output += String.format("%-10s %-40s %-10s\n", movieID, title, releaseDate);
			}

			if (numFound > 0) {
				output += numFound + " movies containing this keyword found.";
				Helper.line(80, "-");
				System.out.println(output);

			} else {
				System.out.println("NO MOVIES WITH KEYWORD SEARCHED FOUND.");
			}

		} catch (SQLException se) {
			System.out.println("SQL Error: " + se.getMessage());
		}
	}
}
