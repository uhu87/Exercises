package pl.uhu87.OOP.Cart;

import java.util.Arrays;
import java.util.SortedMap;

public class main {
    public static void main(String[] args) {


        Product szynka = new Product("szynka", 200);
        Product maslo = new Product("maslo", 100);
        Product cola = new Product("cola", 300);
        Product pierogi = new Product("pierogi", 600);
        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.addProduct(szynka, 2);
        shoppingCart1.addProduct(maslo, 3);
        shoppingCart1.addProduct(cola, 3);
        shoppingCart1.addProduct(pierogi, 5);


        shoppingCart1.removeProduct(szynka);
        shoppingCart1.removeProduct(pierogi);

        shoppingCart1.printReceipt();



    }
}
