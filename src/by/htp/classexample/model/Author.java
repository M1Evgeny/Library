package by.htp.classexample.model;

import java.util.Date;

public class Author {
	String name;
	String surname;
	Date birthDate;

	public Author() {

	}

	public Author(String name, String surname, Date birthDate) {
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
	}
}
