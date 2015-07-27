package Accounts;

import com.company.Customer;

import java.util.Random;

/**
 * Created by Admin on 26.07.2015.
 */
public class SavingAccount extends Account {

    /**
     * constructor with parameters
     *
     * @param account is account to set
     */
    public SavingAccount(Account account) {
        this.customer = account.getCustomer();
        this.id = account.getId();
        this.balance = account.getBalance();
        this.type = Accounts_type.Saving;
        this.interest = 0.05 / 30;
    }

    /**
     * constructor with parameters
     * @param customer is customer to make account for
     * @param cash is cash to deposit on the account
     */
    public SavingAccount(Customer customer, Double cash) {
        this.customer = customer;
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.balance = cash;
        this.type = Accounts_type.Saving;
        this.interest = 0.05 / 30;
    }

    @Override
    public void calculate() {
        this.balance += balance * interest;
    }

    @Override
    public void description() {
        System.out.println("Saving account");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Initial deposit: 50000 rubles");
        System.out.println("Interest per month: 5%");
        System.out.println("+-----------------------------------------------------+");

    }

    public Double getInterest() {
        return interest;
    }
}
