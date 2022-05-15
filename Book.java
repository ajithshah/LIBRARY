class Book {
	private long isbn;
	private String title;
	private String author;
	private String journal;

	public Book(long isbn, String title, String author, String journal) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.journal = journal;
	}


	@Override
	public int hashCode() {
		return (int) this.isbn;
	}
}