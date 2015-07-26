package Accounts;

/**
 * Created by Admin on 26.07.2015.
 */
public class SavingAccount extends Account {
    private Accounts_type type = Accounts_type.Saving;

    /**
     * constructor with pramaneters
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
    }

    @Override
    public void calculate() {

    }

    @Override
    public void description() {
        System.out.println("Saving account");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Initial deposit: 50000 rubles");
        System.out.println("Interest per month: 5%");
        System.out.println("+-----------------------------------------------------+");

    }
}
