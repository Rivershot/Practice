package Practice;

public class BookTest {

	public static void main(String[] args) {

		Attendent Park = new Attendent("Park", 20102250);
		Park.addBook("Catch me If you can", 180000);
		Park.addBook("How to sex with your girl", 20000);
		Park.addBook("What is Justice", 35000);
		
		Park.ShowInfo();
		
		Attendent Choi = new Attendent("Choi",20098321);
		Choi.addBook("what is best sex", 16000);
		Choi.addBook("how to sex my girl friend", 30000);
		Choi.addBook("How can I get prome", 280000);
		
		Choi.ShowInfo();
		
		
	}

}
