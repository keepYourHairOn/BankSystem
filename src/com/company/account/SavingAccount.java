package com.company.account;

import com.company.account.type.ACCOUNT_TYPE;

/**
 * Created by Admin on 26.07.2015.
 */
public class SavingAccount extends Account {
    private ACCOUNT_TYPE type = ACCOUNT_TYPE.CHEQUING;

    public SavingAccount(Account account){
        this.firstName = account.getFirstName();
        this.lastName = account.getLastName();
        this.patronym = account.getPatronym();
        this.dateOfBirth = account.getDateOfBirth();
        this.sex = account.getSex();
        this.passportId = account.getPassportId();
    }

    @Override
    public void calculate() {

    }

    @Override
    public void description() {

    }

}
