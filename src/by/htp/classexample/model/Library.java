package by.htp.classexample.model;

public class Library {
	private Book[] books;
	private int bookCount;

	public Book[] getBooks() {
		return books;
	}

	public void addBook(Book book) {
		if (books != null) {
			if (bookCount < books.length) {
				addNewBook(book);
			} else {
				arrayCopy();
				addNewBook(book);
			}
		} else {
			books = new Book[10];
			addNewBook(book);
		}
	}

	private void addNewBook(Book book) {
		books[bookCount] = book;
		bookCount++;
	}

	private void arrayCopy() {
		Book[] books = new Book[bookCount + 10];
		for (int i = 0; i < this.books.length; i++) {
			books[i] = this.books[i];
		}
		this.books = books;
	}

	public void bookCountInfo() {
		System.out.println("В библиотеке " + bookCount + " книг");
	}

	public void booksInfo() {
		if (books != null) {
			for (Book book : books) {
				if (book != null) {
					book.bookInfo(book);
				}
			}
		}
	}
}
