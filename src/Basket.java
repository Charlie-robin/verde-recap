import discount.Discounter;
import stock.Purchasable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Basket {
    private List<Purchasable> basket = new ArrayList<>();
    private Discounter discount;

    public void setDiscount(Discounter discount) {
        this.discount = discount;
    }

    public void printBasket() {
        basket.forEach(p -> System.out.println(p.getReceipt()));
    }

    public boolean addToBasket(Purchasable purchase){
        return basket.add(purchase);
    }

    public void sortBasket(){
        // ...
        Collections.sort(basket);
    }

    public void makePurchases() {
        System.out.println("-".repeat(10));

        double total = basket.stream().mapToDouble(Purchasable::getPrice).sum();

        System.out.println("Receipt:");
        printBasket();

        System.out.printf("Total Price: £%.2f\n",  total);

        if (discount != null) {
            double discountedTotal = discount.applyDiscount(total);
            System.out.printf("Discounted Total: £%.2f\n" , discountedTotal);
        }

        System.out.println("-".repeat(10));
    }
}