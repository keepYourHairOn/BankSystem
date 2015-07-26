package Transaction;

import java.util.Date;

/**
 * Created by Admin on 26.07.2015.
 */
public class Transfer extends Transaction {
    private Double transfer;
    private Double balance1;
    private Double balance2;
    private String transaction;
    private Transaction_types type = Transaction_types.Transfer;

    /**
     * constructor with parameters
     *
     * @param transfer is transfer to add to the balance2 from the balance1
     * @param balance1 is current balance of the account from which we transfer money
     * @param balance2 is current balance of the account to which we transfer money
     */
    public Transfer(double transfer, double balance1, double balance2) {
        this.transfer = transfer;
        this.balance1 = balance1;
        this.balance2 = balance2;
        this.date = new Date();
    }

    @Override
    public void description() {
        System.out.println("Transferring of the money between two accounts of one branch.");
    }

    @Override
    public void makeTransaction() {

    }
}
