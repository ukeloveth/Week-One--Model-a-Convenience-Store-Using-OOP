package services;

import models.Applicant;
import models.Product;
import models.Store;

import java.util.Map;

public interface StaffServices {
    void canHire(Applicant applicant, Store store);
    void canFire(String staffId, Store store);
    void  canPrintReceipt(String data, String name, int time);
    boolean canValidatePurchase(double wallet, Map<Product, Integer > cart);
}
