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
		if(title == null || title.isBlank() || title.length() < 1) {
			throw new TitleException("Title must be at least 1 character");
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
		if(author == null || author.isBlank() || author.length() < 3) {
			throw new Exception("author must be longer than 3 character");
		}

		boolean flag = false;
		for(int x=0;x<author.length();x++) {
			char c = author.charAt(x);
			int n = Integer.valueOf(c);
			if( (n<=122) && (n>= 97) ) {
				flag = true;
			}
			else if ((n<=90) && (n>= 65)) {
				flag = true;	
			}
			else {
				flag = false;
			}
		}
		if(!flag) {
			throw new Exception("author must only contain characters");
		}
		
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) throws Exception{
		if(publisher == null || publisher.isBlank() || publisher.length() < 3) {
			throw new Exception("Publisher must be longer than 3 character");
		}
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n"
		+"BOOK:\n"
		+ "title: " + getTitle() + "\n"
		+ "page number: " + getPageNumber()+ "\n"
		+ "author: " + getAuthor()+ "\n"
		+ "publisher: " + getPublisher()+ "\n";
		
	}

}
