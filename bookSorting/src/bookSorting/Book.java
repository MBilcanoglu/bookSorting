package bookSorting;

public class Book implements Comparable<Book> {

	private String name;
	private int pages;
	private String author;
	private String publicationDate;

	Book(String name, int pages, String author, String publicationDate) {
		this.name = name;
		this.pages = pages;
		this.author = author;
		this.publicationDate = publicationDate;
	}

	@Override
	public int compareTo(Book o) {
		return this.name.compareTo(o.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return name + ", " + pages + " pages, " + author + ", " + publicationDate;
	}
}
