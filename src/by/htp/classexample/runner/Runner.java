package by.htp.classexample.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import by.htp.classexample.model.Author;
import by.htp.classexample.model.Book;
import by.htp.classexample.model.Library;

public class Runner {

	public static void main(String[] args) {
		Date date1 = makeDate("01-05-1906");

		Author auth1 = new Author("Jack", "London", date1);
		Author auth2 = new Author("Sam", "Albrait", date1);
		Author auth3 = new Author("Nick", "Perumov", date1);
		Author auth4 = new Author("Sim", "Yohka", date1);

		Book bk1 = new Book("Th", 2009);
		Book bk2 = new Book("Th 2.0", 2006);
		Book bk3 = new Book("Th: the return of TRX", 2007);
		Book bk4 = new Book("Th 2.0", 2006);
		Book bk5 = new Book("Th 2.0", 2006);

		Author[] authors = new Author[] { auth1, auth2, auth3 };
		bk1.setAuthor(authors);
		bk2.addAuthor(auth4);

		Library lb = new Library();
		lb.addBook(bk1);
		lb.addBook(bk2);
		lb.addBook(bk3);
		lb.addBook(bk4);
		lb.addBook(bk5);
		lb.bookCountInfo();
		lb.booksInfo();
		System.out.println("_____");
		lb.sortBooksByYear();
		lb.booksInfo();

	}

	public static Date makeDate(String s) {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = null;
		try {
			date = df.parse(s);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
}
