package Accounts;

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
        this.firstName = account.getFirstName();
        this.lastName = account.getLastName();
        this.patronym = account.getPatronym();
        this.dateOfBirth = account.getDateOfBirth();
        this.sex = getSex();
        this.passportId = account.getPassportId();
        this.id = account.getId();
        this.balance = account.getBalance();
        this.type = Accounts_type.Saving;
        this.interest = interest = 0.05 / 30;
    }

    /**
     * default constructor
     */
    public SavingAccount() {
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
