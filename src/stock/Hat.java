package stock;

public class Hat extends Product {
    @Override
    public double getPrice() {
        return 15.99;
    }

    @Override
    public String getReceipt() {
        return getId() + " - Hat - £" + getPrice();
    }


}