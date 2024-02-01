package stock;

public abstract class Product implements Purchasable {
    private static int NEXT_ID = 0;

    private static int getNextId() {
        return ++NEXT_ID;
    }

    private final int id = getNextId();

    public int getId() {
        return id;
    }
}