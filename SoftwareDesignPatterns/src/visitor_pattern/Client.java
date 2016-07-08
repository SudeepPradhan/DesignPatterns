package visitor_pattern;


public class Client {

	public static void main(String[] args){
		
		FineCalculatorForChildren fineCalForChildren = new FineCalculatorForChildren();
		FineCalculatorForAdults fineCalForAdults = new FineCalculatorForAdults();
		
		
		LibraryItems book = new Book("Test Book", 29);
		LibraryItems magazine = new Magazine("Test Magazine", 20);
		LibraryItems media = new Media("Test Media", 30);
		
		System.out.println(book.accept(fineCalForChildren));
		System.out.println(magazine.accept(fineCalForChildren));
		System.out.println(media.accept(fineCalForChildren));
		
		System.out.println(book.accept(fineCalForAdults));
		System.out.println(magazine.accept(fineCalForAdults));
		System.out.println(media.accept(fineCalForAdults));
	}
}
