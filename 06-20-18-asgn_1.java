//implement array list
import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	Book(int id, String name, String author, String publisher, int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
class Shop{
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		Book b1= new Book(101,"Digisol","abc","penguin",60);
		Book b2= new Book(102,"Digisul","efd","guein",50);
		list.add(b1);
		list.add(b2);
		for(Book b : list){
			System.out.println(b.name + " author is "+b.author);
		}
	}
}