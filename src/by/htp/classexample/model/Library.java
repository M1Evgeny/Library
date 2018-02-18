package by.htp.classexample.model;

import java.util.Arrays;
import java.util.Comparator;

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

	public void findBookByTitle(String title) {
		if (books != null) {
			for (Book book : books) {
				if (book != null) {
					if (book.getTitle().equals(title)) {
						System.out.println("Yes, we have this book");
					} else {
						System.out.println("Sorry, we dont have this book");
					}
				}
			}
		}
	}

	public void sortBooksByYear() {
		Arrays.sort(books, new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				int i = 0;
				if (b1 != null & b2 != null) {
					i = b1.getYear() - b2.getYear();
				}
				return i;
			}
		});
	}

	public void deleteBookByTitle(String title) {
		if (books != null) {
			for (int i = 0; i < books.length - 1; i++) {
				if (books[i].getTitle().equals(title)) {
					books[i] = null;
					System.out.println("The book was deleted");
				}
			}
		}
	}
	
	public void findBookByAuthor(String name) {
		if (books != null) {
			for (Book book : books) {
				if (book != null) {
					if(book.authors!=null) {
						for(Author author:book.authors) {
							if(author!=null) {
								if(author.getSurname().equals(name)) {
									System.out.println(book.getTitle());
								}else {
									System.out.println("Sorry, we dont have any books of this author");
								}
							}
						}
					}
				}
			}
		}
	}
}
