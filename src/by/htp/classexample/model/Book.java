package by.htp.classexample.model;

public class Book {
	private String title;
	private int year;
	public Author[] authors;
	int authorCounter;

	public Book() {

	}

	public Book(String title, int year) {
		this.title = title;
		this.year = year;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setAuthor(Author[] authors) {
		if (authors != null) {
			this.authors = authors;
		}
	}

	public Author[] getAuthors() {
		return authors;
	}

	public void addAuthor(Author author) {
		if (authors != null) {
			if (authorCounter < authors.length) {
				authors[authorCounter] = author;
				authorCounter++;
			} else {
				arrayAuthorsCopy();
				addNewAuthor(author);
			}
		} else {
			this.authors = new Author[10];
			addNewAuthor(author);
		}
	}

	private void addNewAuthor(Author author) {
		this.authors[authorCounter] = author;
		authorCounter++;
	}

	private void arrayAuthorsCopy() {
		Author[] authors = new Author[this.authors.length + 10];
		for (int i = 0; i < this.authors.length; i++) {
			authors[i] = this.authors[i];
		}
		this.authors = authors;
	}

	public void bookInfo(Book book) {
		System.out.println("Название книги - " + book.getTitle());
		System.out.println("Год издания - " + book.getYear());
	}
}
