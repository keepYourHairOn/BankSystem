package com.company;

/**
 * Created by Admin on 25.07.2015.
 */
public abstract class Account {
    /**
     * variables for storing account's data
     */
    private static Integer transactionsCount = 0;
    private String firstName;
    private String lastName;
    private String patronym;
    private String dateOfBirth;
    private String sex;
    private String passportId;
    private Transaction[] transactions = new Transaction[100];

    /**
     * abstract methods for child classes to implement
     */
    public abstract void calculate();
    public abstract void description();

    /**
     * method for adding transaction
     * @param transaction
     * @return
     */
    public Transaction addTransaction(Transaction transaction){
        transactionsCount++;
        return null;
    }

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

    public String getPatronym() {
        return patronym;
    }

    public void setPatronym(String patronym) {
        this.patronym = patronym;
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
