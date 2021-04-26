public class Fiction extends Book{

	public Fiction(String btitle) {
        super(btitle);
        setPrice();
    }

    @Override
    void setPrice() {
        bprice= 24.99;
    }


}
