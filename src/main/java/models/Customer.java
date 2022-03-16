package models;

import enums.Gender;
import services.CustomerServices;

import java.util.HashMap;
import java.util.Map;

public class Customer extends User implements CustomerServices {
    private Map<Product,Integer> cart;
    private double wallet;

    public Customer(int id, String name, Gender gender, String email) {
        super(id, name, gender, email);
        this.cart = new HashMap<>();
        this.wallet = 0.00;
    }


    @Override
    public void canAddProductToCart(Product product, int quantity, Store store) {

    }

    @Override
    public void canRemoveProductFromCart() {

    }

    @Override
    public void canCheckout(Staff staff, Store store) {

    }

    public Map<Product, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Product, Integer> cart) {
        this.cart = cart;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
