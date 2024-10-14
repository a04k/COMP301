public class Invoice {
	private String ID;
	private String description;
	private int quantity;
	private double pricePerItem;
	private static int invoices_count = 0;

	public Invoice(String ID, String description, int quantity, double pricePerItem) {
		this.ID = ID;
		this.description = description;
		setQuantity(quantity);
		setPricePerItem(pricePerItem);
		invoices_count++;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getID() {
		return ID;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity > 0 ? quantity : 0;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem > 0 ? pricePerItem : 0;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public double subtotal() {
		return quantity * pricePerItem;
	}

	public double total() {
		return subtotal() * 1.05; // 5% tax
	}

	public void display() {
		System.out.println("Invoice ID: " + ID);
		System.out.println("Description: " + description);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price per item: $" + pricePerItem);
		System.out.println("Subtotal: $" + subtotal());
		System.out.println("Total (including 5% tax): $" + total());
	}

	public static class Cashier {
		private String name;

		public Cashier(String name) {
			this.name = name;
		}

		public int getInvoices() {
			return invoices_count;
		}
	}
}