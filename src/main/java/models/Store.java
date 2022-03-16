package models;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Store {
    private Set<Staff> staffList;
    private List<Product> productList;
    private double account;

    public Store(){
        this.staffList = new HashSet<>();
        this.productList = new ArrayList<>();
        this.account =0.00;
    }

    public Set<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(Set<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}
