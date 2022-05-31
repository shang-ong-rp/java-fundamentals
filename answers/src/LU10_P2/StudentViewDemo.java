package LU10_P2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentViewDemo {

	public static void main(String[] args) {

		try {
			String connectionString = "jdbc:mysql://localhost:3306/testdb";
			String userid = "c372_staff";
			String password = "P@s5w0rd!";
			
			Connection conn = DriverManager.getConnection(connectionString, userid, password);
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("SELECT id, name FROM student");

			String output = String.format("%-5s %-20s\n", "ID", "NAME");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				output += String.format("%-5d %-20s\n", id, name);
			}
			System.out.println(output);

			rs.close();
			statement.close();
			conn.close();

		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}
