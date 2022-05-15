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

	public void getBooks() {
		for(Map.Entry<Book,Integer> entry : books.entrySet()){
			System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());
		}
	}
}