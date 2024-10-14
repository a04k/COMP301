public class App {
	public static void main(String[] args) {
			Invoice invoice1 = new Invoice("420", "wag3 2alb", 1, 10000.00);
			invoice1.display();

			Invoice invoice2 = new Invoice("256", "potato", 360, 5.00);
			invoice2.display();

			Invoice.Cashier cashier = new Invoice.Cashier("walter white");
			System.out.println("Total invoices created: " + cashier.getInvoices());

			Complex c1 = new Complex(	4, 5);
			Complex c2 = new Complex(2, 3);

			Complex sum = c1.addTo(c2);
			Complex product = c1.multiplyTo(c2);

			System.out.println("\nComplex numbers:");
			c1.display();
			c2.display();
			System.out.println("Sum:");
			sum.display();
			System.out.println("Product:");
			product.display();

			Author author = new Author("AK", "63ak@ak.work");
			Book book = new Book("010-5555555", "wag3 el 2alb", author, "5zan el a7zan", 150);

			System.out.println("\nBook information:");
			System.out.println(book);
			
			Book bookDos = new Book("010-5555555", "wag3 el 2alb 2", author, "5zan el a7zan", 1.25);
			System.out.println("Books are equal: " + book.equals(bookDos));
	}
}
