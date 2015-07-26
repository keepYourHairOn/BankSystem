package Accounts;

/**
 * Created by Admin on 26.07.2015.
 */
public class BusinessAccount extends Account {

    /**
     * constructor with parameters
     *
     * @param account is account to set
     */
    public BusinessAccount(Account account) {
        this.customer = account.getCustomer();
        this.id = account.getId();
        this.balance = account.getBalance();
        this.type = Accounts_type.Business;
        this.interest = 0.01 / 30;
    }

    /**
     * default constructor
     */
    public BusinessAccount() {
    }

    @Override
    public void calculate() {
        this.balance += balance * interest;
    }

    @Override
    public void description() {
        System.out.println("Business account");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Initial deposit: 5000000 rubles");
        System.out.println("Interest per month: 1%");
        System.out.println("+-----------------------------------------------------+");
    }

    public Double getInterest() {
        return interest;
    }
}
