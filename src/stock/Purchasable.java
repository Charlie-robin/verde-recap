package stock;

// Comparable

// CONTRACT
public interface Purchasable extends Comparable<Purchasable>{
    double getPrice();
    String getReceipt();
    // PUBLIC ABSTRACT METHODS WITH EMPTY BODY
    // THE CONCRETE CLASS WILL HAVE TO IMPLEMENT THE METHOD
}
