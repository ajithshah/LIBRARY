import java.util.HashMap;
import java.util.Map;

class Library {
	private static Library library = null;
	private Map<Book, Integer> books;
	private Library() {
		this.books = new HashMap<Book, Integer>();
	};

	public static Library getLibrary() {
		if (library == null) {
			Library libraryInstance = new Library();
			library = libraryInstance;
		}
		return library;
	};


	public void addBooks(Book book, int quantity) {
		int existingQuantity = this.books.getOrDefault(book, 0);
		this.books.put(book, existingQuantity + quantity);
	}


	public void getBook() {
		System.out.println("ISBN\tTITLE\tAUTHOR\tJOURNAL");
		for(Map.Entry<Book,Integer> entry : books.entrySet()){
			if(entry.getValue()>0) {
				System.out.println(entry.getKey().getIsbn() + "\t\t" + entry.getKey().getTitle() +"\t" + entry.getKey().getAuthor() + "\t" + entry.getKey().getJournal());
			}
		}
	}

	public void getBooks() {
		System.out.println("ISBN\tTITLE\tAUTHOR\tJOURNAL\tQUANTITY");
		for(Map.Entry<Book,Integer> entry : books.entrySet()){
			System.out.println(entry.getKey().getIsbn()+"\t\t"+entry.getKey().getTitle()+"\t"+entry.getKey().getAuthor()+"\t"+entry.getKey().getJournal()+"\t"+entry.getValue());
		}
	}


	public void getSearchBook(String searchBook) {
		System.out.println("ISBN\tTITLE\tAUTHOR\tJOURNAL");
		for(Map.Entry<Book,Integer> entry : books.entrySet()) {
			if (entry.getKey().getTitle().equals(searchBook)) {
				System.out.println(entry.getKey().getIsbn()+"\t\t"+entry.getKey().getTitle()+"\t"+entry.getKey().getAuthor()+"\t"+entry.getKey().getJournal());
				break;
			}
		}
	}

	void getBookTitle() {
		System.out.println("ISBN\tTITLE");
		for(Map.Entry<Book,Integer> entry : books.entrySet()){
			System.out.println(entry.getKey().getIsbn()+"\t\t"+entry.getKey().getTitle());
		}
	};
}