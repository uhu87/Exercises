package pl.uhu87.OOP.Cart;

import java.util.Arrays;

public class ShoppingCart {

    private CartItem[] cartItems = new CartItem[0];


    public ShoppingCart() {
    }

    public ShoppingCart(CartItem[] cartItems) {
        this.cartItems = cartItems;
    }

    public void addProduct(Product product, int quantity) {

        if (checkProductInCartItem(product) == true) {
            CartItem cartItem = findCartItemByProduct(product);
            cartItem.setQuantity(cartItem.getQuantity() + quantity);


        } else {
            CartItem cartItem = new CartItem(product, quantity);
            CartItem[] tempCartItems = Arrays.copyOf(cartItems, cartItems.length + 1);
            tempCartItems[tempCartItems.length - 1] = cartItem;
            cartItems = tempCartItems;
        }

    }


    public void removeProduct (Product product) {
        if (checkProductInCartItem(product) == true) {
            CartItem[] tempCartItems = new CartItem[0];
            for (int i = 0; i < cartItems.length; i++) {
                if(!cartItems[i].getProduct().equals(product)){

                    tempCartItems=Arrays.copyOf(cartItems, tempCartItems.length+1);
                    tempCartItems[tempCartItems.length-1]=cartItems[i];

                }
            }
            cartItems=tempCartItems;


        } else {
            System.out.println("no product like this in the shopping cart");
        }

    }

    public void printReceipt(){

        for (int i = 0; i < cartItems.length; i++) {
            System.out.println(cartItems[i].getProduct().getName()+cartItems[i].getQuantity());
        }
    }


    public boolean checkProductInCartItem(Product product) {

        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].getProduct().equals(product)) return true;

        }
        return false;
    }

    public CartItem findCartItemByProduct(Product product) {

        for (int i = 0; i < cartItems.length; i++) {
            if (cartItems[i].getProduct().equals(product)) {
                return cartItems[i];
            }
        }
        return null;
    }


    public CartItem[] getCartItems() {
        return cartItems;
    }
}

