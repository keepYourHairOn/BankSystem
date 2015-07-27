package Transaction;

import Accounts.Account;

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
     */
    public Transfer(double transfer, Account type1, Account type2) {
        this.transfer = transfer;
        this.firstAccount = type1;
        this.secondAccount = type2;
        this.balance1 = firstAccount.getBalance();
        this.balance2 = secondAccount.getBalance();
        this.firstAccountBranch = firstAccount.getBranch();
        this.secondAccountBranch = secondAccount.getBranch();
        this.date = new Date();
    }

    @Override
    public void description() {
        System.out.println("Transferring of the money between two accounts of one branch.");
    }

    @Override
    public void makeTransaction() {
        if (transfer <= balance1 && transfer > 0) {
            balance1 -= transfer;
            balance2 += transfer;
            isValid = true;
            transaction = "Transfer: " + transfer + " rubles. From: " + firstAccount.getId() + " To: " + secondAccount.getId();
            this.firstAccount.addTransaction(this);
            this.secondAccount.addTransaction(this);
            System.out.println("Transfer operation inside one branch complete successfully!");
        } else {
            this.isValid = false;
            System.out.println("Transferring operation failure!");
        }
    }
}
