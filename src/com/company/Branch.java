package com.company;

/**
 * Created by Admin on 25.07.2015.
 */
public class Branch {
    private static Integer accountsCount = 0;
    private int id;
    private String address;
    private String phoneNumber;
    private String businessHoursListing;
    private Account[] accounts = new Account[100];

    public Account createAccount(String name, String address){
        accountsCount++;
        return null;
    }

    /*
     * getters and setters for private variables
     */
    public Account getAccountById(Integer id){
        return null;
    }

    public Account deleteAccount(Integer id) {
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBusinessHoursListing() {
        return businessHoursListing;
    }

    public void setBusinessHoursListing(String businessHoursListing) {
        this.businessHoursListing = businessHoursListing;
    }
}
