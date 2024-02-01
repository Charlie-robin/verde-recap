package discount;

public class StaffDiscount implements Discounter {
    @Override
    public double applyDiscount(double price) {
        System.out.printf("STAFF DISCOUNT: -%.2f\n", price * 0.4);
         return price - price * 0.4;
    }
}
