package discount;

class BlackFridayDiscount implements Discounter {

    @Override
    public double applyDiscount(double price) {
        System.out.printf("BLACK FRIDAY DISCOUNT: -%.2f\n", price * 0.8);
        return price - price * 0.8;
    }
}
