package collections;

import java.util.ArrayList;
import java.util.Iterator;
class book_shelf{
	String book,author,genre;
	int id;
	public book_shelf(String book, String author, String genre, int id) {
		this.book = book;
		this.author = author;
		this.genre = genre;
		this.id = id;
	}

}

public class BookStore {
	public static void main(String[] args) {
		ArrayList<book_shelf> list=new ArrayList<>();
		book_shelf bs =new book_shelf("The Great Gatsby","john","fiction",1);
		list.add(bs);
		list.add(new book_shelf("Jane Eyre","Jane","fiction",2));
		list.add(new book_shelf("To kill a Mockingbird","Jane","fiction",3));
		for(book_shelf items:list) {
			System.out.println(items);
		}
		System.out.println("bookitems in Arraylist using iterable:");
		Iterator<book_shelf>itr=list.iterator();
		while(itr.hasNext()) {
			book_shelf items =itr.next();
			System.out.println(items);
		}


	}

}
