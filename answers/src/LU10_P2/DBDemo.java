package LU10_P2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {

	public static void main(String[] args) {
		System.out.println("DB test...");
		try {
			String connectionString = "jdbc:mysql://localhost:3306/testdb";
			String db_username = "c372_staff";
			String db_userpassword = "P@s5w0rd!";

			// Step 1: Construct a database 'Connection' object called 'conn'
			Connection conn = DriverManager.getConnection(connectionString, db_username, db_userpassword);
			// The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"
			
			// Step 2: Construct a 'Statement' object called 'statement' inside the Connection created
			Statement statement = conn.createStatement();
			
			// Step 3: Write a SQL query string. Execute the SQL query via the 'Statement'.
	        // The query result is returned in a 'ResultSet' object called 'rs'.
			String strSelect = "SELECT * FROM movie";
	        System.out.println("The SQL statement is: " + strSelect + "\n"); // Echo For debugging
			ResultSet rs = statement.executeQuery(strSelect);
			
			// Step 4: Process the 'ResultSet' by scrolling the cursor forward via next().
	        //  For each row, retrieve the contents of the cells with getXxx(columnName).
			System.out.println("The records selected are:");
			int ctr = 1;
			// Row-cursor initially positioned before the first row of the 'ResultSet'.
	        // rset.next() inside the whole-loop repeatedly moves the cursor to the next row.
	        // It returns false if no more rows.
			while (rs.next()) {  // Repeatedly process each row
				String title = rs.getString("title");  // retrieve a 'String'-cell in the row
	            String date = rs.getString("release_date");  // retrieve a 'double'-cell in the row
	            String description = rs.getString("description");       // retrieve a 'int'-cell in the row
	            System.out.println("Movie no " + ctr + ": " + title + " which is out on the " + date + " is about " + description);
				ctr++;
			}
			
			rs.close();
			statement.close();
			conn.close();

		} catch (SQLException se) {
			System.out.println("Error: " + se.getMessage());
		}
	}
}


