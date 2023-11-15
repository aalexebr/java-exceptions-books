package org.lessons.java.books;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
				
			} 
			catch (TitleException e) {
				System.out.println("title error:"+e.getMessage());
			}
			catch (Exception e) {
				System.out.println("error: "+ e.getMessage());
			}
			
		}
		
		in.close();
		
		System.out.println(Arrays.asList(bookArray));
		
//		FILE 
		
		 File file = new File("books.txt");
		 
//		 WRITE
		 
		 FileWriter writer = null;
		 try {
			 writer = new FileWriter(file);
			
//			writer.write("testtestets");
			for(int x=0; x<bookNumber; x++) {
				writer.write(bookArray[x] + "\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		 finally {
			 if (writer != null)
					try {
						writer.close();
					} catch (IOException e) { }
			 System.out.println("print should be done");
		 }
		 
//		 READ IN CONSOLE
		 
		 Scanner reader = null;
			try {
				
				reader = new Scanner(file);
				
				while (reader.hasNextLine()) {
				   String data = reader.nextLine();
				   
				   
					   System.out.println(data);
				}
			} 
			catch (FileNotFoundException e) {
				
				System.out.println("Error reading file: " + e.getMessage());
			} finally {
				
				if (reader != null)
					reader.close();
			}
		
	}
}
