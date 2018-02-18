package by.htp.classexample.model;

import java.util.Date;

public class Author {
	private String name;
	private String surname;
	private Date birthDate;

	public String getName() {
		return name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public Author() {

	}

	public Author(String name, String surname, Date birthDate) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}

	public String getSurname() {
		return surname;
	}

}
