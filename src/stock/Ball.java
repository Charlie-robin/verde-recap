package stock;

public class Ball extends Product {
    @Override
    public double getPrice() {
        return 9.99;
    }

    @Override
    public String getReceipt() {
        return getId() + " - Ball - £" + getPrice();
    }


}

