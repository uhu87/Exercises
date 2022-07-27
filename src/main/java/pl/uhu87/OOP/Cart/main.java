package pl.uhu87.OOP.Cart;

import java.util.Arrays;
import java.util.SortedMap;

public class main {
    public static void main(String[] args) {


        Product product1 = new Product("szynka", 200);
        Product product2 = new Product("maslo", 100);
        Product product3 = new Product("cola", 300);

        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCart1.addProduct(product1, 2);
        shoppingCart1.addProduct(product2, 3);
        shoppingCart1.addProduct(product2, 3);


        System.out.println(shoppingCart1.getCartItems()[0].getProduct().getName());
        System.out.println(shoppingCart1.getCartItems()[0].getQuantity());
        System.out.println(shoppingCart1.getCartItems()[1].getProduct().getName());
        System.out.println(shoppingCart1.getCartItems()[1].getQuantity());


       // System.out.println(shoppingCart1.checkProductInCartItem(product1));
       // System.out.println(shoppingCart1.checkProductInCartItem(product3));
    }
}
