public class Life extends Insurance {

	public Life(String type, double monthly) {
		super("Life", monthly);
		setCost();
	}

	void setCost() {
		monthly = 36;
		
	}
	void display() {
		System.out.println ("Insurance in " + getTypeLife());
		System.out.println ("Monthly Fee: $" + getPriceLife());
	}

}
