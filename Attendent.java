package Practice;

import java.util.ArrayList;

public class Attendent {

	private int AttendentId;
	private String AttendentName;
	private ArrayList<Book> BookList;
	
	public Attendent (String AttendentName, int AttendentId) {
		this.AttendentId = AttendentId;
		this.AttendentName = AttendentName;
		
		BookList = new ArrayList<Book>();
	}
	
	public void addBook(String BookName, int BookPrice) {
		
		Book book = new Book();
		book.setBookName(BookName);
		book.setBookPrice(BookPrice);
		
		BookList.add(book);
	}
	
	public void ShowInfo() {
		int total = 0;
		for (Book book : BookList) {
			total += book.getBookPrice();
			System.out.println(AttendentName + " add " + book.getBookName() + " price is " + book.getBookPrice());
		}
		System.out.println("Total price is " + total);
	}
}
