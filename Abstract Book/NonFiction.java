public class NonFiction extends Book{

    public NonFiction(String btitle) {
        super(btitle);
        setPrice();
    }

    @Override
    void setPrice() {
        bprice= 37.99;
    }
}
