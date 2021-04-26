public abstract class Book {

    public String btitle;
    public double bprice;

    public Book(String btitle) {
        this.btitle = btitle;
    }

    public String getBtitle() {
        return btitle;
    }

    public double getBprice() {
        return bprice;
    }

    abstract void setPrice();

}
