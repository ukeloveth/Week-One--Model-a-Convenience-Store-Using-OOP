package models;

import enums.Gender;

public class Applicant extends User{
    private  String qualification;



    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Applicant(int id, String name, Gender gender, String email, String qualification) {
        super(id, name, gender, email);
        this.qualification = qualification;
    }
}
