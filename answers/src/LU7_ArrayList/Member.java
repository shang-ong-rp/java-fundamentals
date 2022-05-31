package LU7_ArrayList;

public class Member {

	private String username;
	private String password;
	private int points;

	public Member(String username, String password, int points) {
		this.username = username;
		this.password = password;
		this.points = points;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	
	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {

		this.points = points;

	}

	public void setPassword(String password) {

		if (checkValidPassword(password) == true) {
			this.password = password;
			System.out.println(username + "'s password has been updated.");
		} else {
			System.out.println("Password will not be reset as it is not 8 characters long. ");
		}
	}

	
	private boolean checkValidPassword(String pw) {

		boolean isValid = false;

		if (pw.length() == 8) {
			isValid = true;
		}

		return isValid;
	}

}
