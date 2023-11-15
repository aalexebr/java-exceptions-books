package org.lessons.java.books;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
//		try {
//			Book b = new Book("as", 11, "a", "publisher");
//			System.out.println(b);
//		}
//		catch (TitleException e) {
//			System.out.println("title error:"+e.getMessage());
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		int bookNumber;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many books?");
		String strNumbOfBooks = in.nextLine();
		bookNumber = Integer.valueOf(strNumbOfBooks);
		
		Book[] bookArray = new Book[bookNumber];
		
		int index = 0;
			
		while(true) {
			if(index == bookNumber) {
				break;
			}
			System.out.println("Book"+(index+1)+":");
			System.out.print("Book title?");
			String strTitle = in.nextLine();
			
			System.out.print("number of pages?");
			String strPages = in.nextLine();
			int pages = Integer.valueOf(strPages);
			
			System.out.print("author?");
			String strAuthor = in.nextLine();
			
			System.out.print("publisher?");
			String strPublisher = in.nextLine();
			
			try {
				Book b = new Book(strTitle, pages, strAuthor, strPublisher);
				bookArray[index] = b;
				index++;
				
			} catch (Exception e) {
				System.out.println("error: "+ e.getMessage());
			}
			
		}
		
		System.out.println(Arrays.asList(bookArray));
		
	}
}
