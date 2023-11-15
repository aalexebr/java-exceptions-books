package org.lessons.java.books;

public class Book {
	
	private String title;
	private int pageNumber;
	private String author;
	private String publisher;
	
	public Book(String title, int pageNumber, String author, String publisher) throws Exception{
		setTitle(title);
		setPageNumber(pageNumber);
		setAuthor(author);
		setPublisher(publisher);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws TitleException{
		if(title == null || title.isEmpty() || title.length() < 1) {
			throw new TitleException("Title must be longer than 1 character");
		}
		this.title = title;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) throws Exception{
		if(pageNumber <= 0) {
			throw new Exception("Page number must me more than 0");
		}
		this.pageNumber = pageNumber;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception{
		if(author == null || author.isEmpty() || author.length() < 3) {
			throw new Exception("author must be longer than 3 character");
		}
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception{
		if(publisher == null || publisher.isEmpty() || publisher.length() < 3) {
			throw new Exception("Publisher must be longer than 3 character");
		}
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"
		+"BOOK:"
		+ "title: " + getTitle() + "\n"
		+ "page number: " + getPageNumber()+ "\n"
		+ "author: " + getAuthor()+ "\n"
		+ "publisher: " + getPublisher()+ "\n";
		
	}

}
