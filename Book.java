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

	public String getJournal() {
		return journal;
	}

	public String getTitle() {
		return title;
	}

	public long getIsbn() {
		return isbn;
	}

	public String getAuthor() {
		return author;
	}

//	@Override
//	public int hashCode() {
//		return (int) this.isbn;
//	}
}