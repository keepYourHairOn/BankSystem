package Accounts;

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
     * default constructor
     */
    public ChequingAccount() {
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
