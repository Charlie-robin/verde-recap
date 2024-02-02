import discount.BlackFridayDiscount;
import discount.StaffDiscount;
import stock.Ball;
import stock.Hat;
import stock.Promotion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Basket basket  = new Basket();
        // ADDING IMPLEMENTATIONS OF PURCHASEABLE TO BASKET
        basket.addToBasket(new Ball());
        basket.addToBasket(new Hat());
        basket.addToBasket(new Promotion());
        basket.addToBasket(new Ball());
        basket.addToBasket(new Hat());
        basket.addToBasket(new Promotion());

        basket.printBasket();

        basket.sortBasket();

        basket.makePurchases();

        basket.printBasket();

        // MAKING A INTERFACE FOR SOME FUNCTIONALITY THAT WILL CHANGE
        // - FLEXIBILITY IN THE DESIGN
        // - LOOSE COUPLING

        basket.setDiscount(new StaffDiscount());

        basket.makePurchases();

        basket.setDiscount(new BlackFridayDiscount());

        basket.makePurchases();

        List<String> strings = new ArrayList<>(List.of("Fi", "Alejandra", "Sacha"));

        System.out.println(strings);

        Collections.sort(strings);

        System.out.println(strings);

        // YOU CAN USE INTERFACES IN YOUR PROJECTS
        Consumer<String> logger = (s) -> System.out.println(s);
        Consumer<String> purpleLogger = (s) -> logger.accept("\u001B[35m" + s + "\u001B[0m" );
        // :D
        strings.forEach((s) -> System.out.println(s));
        strings.forEach(logger);
        strings.forEach(purpleLogger);

    }
}