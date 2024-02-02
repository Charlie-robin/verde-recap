package stock;

public class Promotion implements Purchasable {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getReceipt() {
        return "Promotion - Free";
    }

    @Override
    public int compareTo(Purchasable o) {
        return -1;
    }
}