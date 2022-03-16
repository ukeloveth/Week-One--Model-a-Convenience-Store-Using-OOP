package services;

import models.Product;
import models.Staff;
import models.Store;

public interface CustomerServices {
    void canAddProductToCart(Product product, int quantity, Store store);
    void  canRemoveProductFromCart();
    void  canCheckout(Staff staff, Store store);

}
