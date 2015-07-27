package Accounts;

import com.company.Customer;

import java.util.Random;

/**
 * Created by Admin on 26.07.2015.
 */
public class ChequingAccount extends Account {
    /**
     * constructor with parameters
     *
     * @param account is account to set
     */
    public ChequingAccount(Account account) {
        this.customer = account.getCustomer();
        this.id = account.getId();
        this.balance = account.getBalance();
        this.type = Accounts_type.Chequing;
        this.interest = 1000d / 30;
    }

    /**
     * constructor with parameters
     * @param customer is customer to make account for
     * @param cash is cash to deposit on the account
     */
    public ChequingAccount(Customer customer, Double cash) {
        this.customer = customer;
        Random random = new Random();
        this.id = random.nextInt(1000);
        this.balance = cash;
        this.type = Accounts_type.Chequing;
        this.interest = 1000d / 30;
    }

    @Override
    public void calculate() {
        this.balance -= interest;
    }

    @Override
    public void description() {
        System.out.println("Chequing account");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Initial deposit: 1000 rubles");
        System.out.println("Amount of fee per month: 1000 rubles");
        System.out.println("+-----------------------------------------------------+");
    }

    public Double getInterest() {
        return interest;
    }
}
