package com.company;

/**
 * Created by Admin on 25.07.2015.
 */
public abstract class Account {
    private String firstName;
    private String lastName;
    private String patrinym;
    private String dateOfBirth;
    private String sex;
    private String passportId;
    private Transaction[] transactions = new Transaction[100];

    public abstract void calculate();

    /*
     * getters and setters for private variables
     */
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatrinym() {
        return patrinym;
    }

    public void setPatrinym(String patrinym) {
        this.patrinym = patrinym;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }
}
