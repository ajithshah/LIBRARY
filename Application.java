import java.util.*;

class Application{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------Library Management System-----------------");

		Book books0 = new Book(100, "java", "Ajith", "ajith-journal");
		Book books1 = new Book(200, "C++", "kumar", "kumar-journal");
		Book books2 = new Book(300, "C Language", "shah", "shah-journal");
		Book books3 = new Book(400, "Html", "Sandy", "sandy-journal");
		Book books4 = new Book(500, "Javascript", "afrid", "afrid-journal");

		Library library = Library.getLibrary();
		library.addBooks(books0, 5);
		library.addBooks(books1, 1);
		library.addBooks(books2, 0);
		library.addBooks(books3, 3);
		library.addBooks(books4, 4);


//			--------------FLOW-------------------

		System.out.println("1-Learner\t2-Librarian\t3-Exit");
		int inputFromUser = input.nextInt();
		while (inputFromUser != 3) {

			System.out.println("Welcome");
			if (inputFromUser == 1) {
				System.out.println("1-View all available books\t2-Search a Book with Title");
				int learnerOption = input.nextInt();
				if (learnerOption == 1) {
					System.out.println("Available Books");
					library.getBook();
				}
				if (learnerOption == 2) {
					System.out.println("Available books with title");
					library.getBookTitle();
					System.out.println("Enter Book Title");
					input.nextLine();
					String searchBook = input.nextLine();
					library.getSearchBook(searchBook);
				}
			}

			if (inputFromUser == 2) {
				System.out.println("1-View all Books\t2-Add Book(s)");
				int librarianOption = input.nextInt();
				if (librarianOption == 1) {
					library.getBooks();
				}
				if (librarianOption == 2) {
					System.out.println("Enter Book ISBN");
					long isbn = input.nextLong();
					System.out.println("Enter Book Title");
					input.nextLine();
					String title = input.nextLine();
					System.out.println("Enter Book Author");
					String author = input.nextLine();
					System.out.println("Enter Book journal");
					String journal = input.nextLine();
					Book bok1 = new Book(isbn, title, author, journal);
					System.out.println("Book Quatity");
					int bookQualtity = input.nextInt();
					library.addBooks(bok1, bookQualtity);
					library.getBooks();
				}
			}
		}
		input.close();
		System.out.println("thank you Visit again");
	}
}