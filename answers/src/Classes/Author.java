package Classes;

public class Author {

	public String name;
	public String email;
	public char gender;
	
	public Author(String n, String e, char g) {
		name = n;
		email = e;
		gender = g;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setEmail(String e) {
		email = e;
	}
	
	public String toString() {
		String str = "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
		return str;
	}

} // end class
