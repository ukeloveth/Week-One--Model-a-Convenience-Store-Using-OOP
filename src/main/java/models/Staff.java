package models;

import enums.Gender;
import services.StaffServices;

import javax.management.relation.Role;
import java.util.Map;

public class Staff extends User implements StaffServices {

    private String staffId;
    private Role role;
    private  String qualification;
    private double performance;

    public Staff(int id, String name, Gender gender, String email, String staffId, Role role, String qualification, double performance) {
        super(id, name, gender, email);
        this.staffId = staffId;
        this.role = role;
        this.qualification = qualification;
        this.performance = performance;
    }

    @Override
    public void canHire(Applicant applicant, Store store) {

    }

    @Override
    public void canFire(String staffId, Store store) {

    }

    @Override
    public void canPrintReceipt(String data, String name, int time) {

    }

    @Override
    public boolean canValidatePurchase(double wallet, Map<Product, Integer> cart) {
        return false;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", role=" + role +
                ", qualification='" + qualification + '\'' +
                ", performance=" + performance +
                '}';
    }
}
