package Project3;

import java.sql.* ;

public class SQL {
	
	Statement statement;
		
	public SQL() throws SQLException
	{
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver()) ;
		} catch (Exception cnfe) {
			System.out.println("Class not found");
		}	 
	
		Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/shopping_cart", "c372_staff", "P@s5w0rd!") ;
	    statement = con.createStatement (ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE ) ;
	    System.out.println("Build connection with database successfully");
	}
		
	public void WriteExcute(String sqlCode)
	{
		try {
			statement.executeUpdate ( sqlCode ) ;
			System.out.println("Write excute the code "+sqlCode);
		} catch (SQLException e) {
			int errorCode = e.getErrorCode(); // Get SQLCODE
			String sqlState = e.getSQLState(); // Get SQLSTATE     
			System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
		}
	}
		
	public java.sql.ResultSet QueryExchte(String sqlCode)
	{ 
		java.sql.ResultSet rs = null;
		try {
			rs = statement.executeQuery (sqlCode ) ;
			System.out.println("Query excute the code "+sqlCode);
		} catch (SQLException e) {
			int errorCode = e.getErrorCode(); // Get SQLCODE
			String sqlState = e.getSQLState(); // Get SQLSTATE     
			System.out.println("Code: " + sqlCode + "  sqlState: " + sqlState);
		}
			
		return rs;
	}
		
} // end Class