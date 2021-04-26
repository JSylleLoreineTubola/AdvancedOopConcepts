public class Health extends Insurance {

	public Health (String type, double monthly) {
		super("Health", monthly);
		setCost();
    }

	@Override
	void setCost() {
		monthly = 196;

	}

	@Override
	void display() {
			System.out.println ("Insurance in " + getTypeHealth());
			System.out.println ("Monthly Fee: $" + getPriceHealth());
		}
	}
