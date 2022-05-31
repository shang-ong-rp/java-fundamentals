package LU6;

import java.time.LocalDate;

public class Emp {
	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private LocalDate dateJoined;
	
	public Emp(int id, String name, LocalDate dateOfBirth, LocalDate dateJoined) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.dateJoined = dateJoined;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public LocalDate getDateJoined() {
		return dateJoined;
	}

}
