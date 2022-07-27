package pl.uhu87.OOP.Cart;

public class PriceTooLow extends RuntimeException{

    public PriceTooLow(String message) {
        super(message);
    }
}
