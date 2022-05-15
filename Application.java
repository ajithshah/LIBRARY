import java.util.*;

class Application{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("-----------------Library Management System-----------------");

		Book books0 = new Book(100,"java","Ajith","ajith-journal");
		Book books1 = new Book(200,"C++","kumar","kumar-journal");
		Book books2 = new Book(300,"C Language","shah","shah-journal");
		Book books3 = new Book(400,"Html","Sandy","sandy-journal");
		Book books4 = new Book(500,"Javascript","afrid","afrid-journal");

		Library library = Library.getLibrary();
		library.addBooks(books0, 5);
		library.addBooks(books1, 1);
		library.addBooks(books2, 0);
		library.addBooks(books3, 3);
		library.addBooks(books4, 4);

		System.out.println("1-Learner\t2-Librarian\t3-Exit");
		int inputFromUser=input.nextInt();

		if(inputFromUser==1){
			System.out.println("Welcome");
			System.out.println("1-View all available books\t2-Search a Book with name");
			int learnerOption=input.nextInt();
			if(learnerOption==1){
				System.out.println("Available Books");
			}
			if(learnerOption==2){
				System.out.println("Book");
			}
		}

		if(inputFromUser==2){
			System.out.println("1-View all Books\t2-Add Book(s)");
			int librarianOption=input.nextInt();
			if(librarianOption==1){
				library.getBooks();
			}
			if(librarianOption==2){
				String title,author,journal;

				long isbn = Long.parseLong(String.valueOf(input.nextLong()));
				System.out.println(isbn);
				title=input.nextLine();
				author=input.nextLine();
				journal=input.nextLine();
				new Book(isbn,author,title,journal);
				library.getBooks();
			}
		}
	}
}