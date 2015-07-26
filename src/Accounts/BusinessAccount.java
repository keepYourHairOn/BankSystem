package Accounts;

/**
 * Created by Admin on 26.07.2015.
 */
public class BusinessAccount extends Account {
    Accounts_type type = Accounts_type.Business;

    /**
     * constructor with pramaneters
     *
     * @param account is account to set
     */
    public BusinessAccount(Account account) {
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
        System.out.println("Business account");
        System.out.println("+-----------------------------------------------------+");
        System.out.println("Initial deposit: 5000000 rubles");
        System.out.println("Interest per month: 1%");
        System.out.println("+-----------------------------------------------------+");
    }
}