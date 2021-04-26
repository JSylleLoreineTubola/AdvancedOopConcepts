public class BookArray {

    public static void main(String[] args) {
        
        //Creating Book array which stores Fiction and Non-Fiction Book Objects
    		
    		Book bookArray[]= new Book [10];
        
        	bookArray[0]= new Fiction ("The Year We Became Invincible");
        	bookArray[1]= new Fiction ("Same But Different");
        	bookArray[2]= new Fiction ("Screenshot");
        	bookArray[3]= new Fiction ("The Selection");
        	bookArray[4]= new Fiction ("The Other Side");
            bookArray[5]= new Fiction ("Between Now and Ever after");
            bookArray[6]= new Fiction ("All About Her");
            bookArray[7]= new NonFiction  ("I was told to come alone");
            bookArray[8]= new NonFiction("Hunger");
            bookArray[9]= new NonFiction ("The Art of Cruelty");

        //This for loop will displays the Each Fiction and Non-Fiction book details
        for(int i=0; i< bookArray.length; i++)
        {
            //Displaying the information of each book
            System.out.println(bookArray[i].getBtitle() + " " + bookArray[i].getBprice() + "\n" );
        }
    }

}
