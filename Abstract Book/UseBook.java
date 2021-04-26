public class UseBook 
{
	public static void main (String [] args)
	{
	
		Book book;
		System.out.print("Name of Fiction Book:\n");
		book = new Fiction ("Harry Potter");
		System.out.println(book.getBtitle() + " for $" + book.getBprice());
		
		System.out.print("\nName of the Non Fiction Book:\n");
		book = new NonFiction ("Silent Spring");
		System.out.println(book.getBtitle() + " for $" + book.getBprice());
	}
}