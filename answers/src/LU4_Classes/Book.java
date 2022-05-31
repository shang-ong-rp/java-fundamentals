package LU4_Classes;

public class Book {

	public String name;
	public Author author;
	public double price;
	public int qty = 0;
	
	public Book (String n, Author a, double p) {
		name = n;
		author = a;
		price = p;
	}
	
	public Book (String n, Author a, double p, int q) {
		name = n;
		author = a;
		price = p;
		qty = q;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		price = p;
	}
	
	public int getQty() {
		return qty;
	}
	
	public void setQty(int q) {
		qty = q;
	}
	
	public String toString() {
		String authorStr = author.toString();
		String bookStr = "Book[name=" + name + ",Author=" + authorStr + ",price=" + price + ",qty=" + qty + "]";
		return bookStr;
	}
}
