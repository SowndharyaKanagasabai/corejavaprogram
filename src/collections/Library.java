package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.lang.String;

//import exception_handling.Custom_ExceptionEx;
class Bookshelf{
	 String[]books;
	public Bookshelf(int range) {
		this.books=new String[range];
	}
	public String addBook(String bookitems, int index) {
		 if(index >=0 && index < books.length) {
			 return books[index]=bookitems;
		 }
		 else {
		 return "Invalid index, Books are not added in the shelf";
		 }
	}
	public int findBook(String booktitle) {
		for(int i=0; i<books.length; i++) {
			if(books[i].equalsIgnoreCase(booktitle)) {
				return i;
			}
		}
		return -1;
	}
	public String displayBooks() {
		StringBuilder booklist = new StringBuilder("Books on the shelf: \n");
		for(String book:books) {
			if(book !=null) {
				booklist.append("- ").append(book+"\n");
			}
		}
		return booklist.toString();
	}
}
public class Library {
	public static void main(String[] args) {
		Bookshelf bs=new Bookshelf(3);
		bs.addBook("The Great Gatsby", 0);
		bs.addBook("Jane Eyre", 1);
		bs.addBook("To kill a Mockingbird", 2);
		bs.addBook("Brave New World", 3);
		System.out.println(bs.displayBooks());
	    //to find a book
		int index=bs.findBook("Jane Eyre");
		if(index!=-1) {
			System.out.println("Book found at index");
		}
		else {
			System.out.println("Book is not found at index");
		}
		
		
	}

}
