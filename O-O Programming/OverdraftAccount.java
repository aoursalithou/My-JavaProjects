package ch15.BankApp;

import ch15.BankApp.Exception.NegativeAmountException;
import ch15.BankApp.Exception.SsnNotValidException;

import java.time.LocalDateTime;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn)
            throws SsnNotValidException, NegativeAmountException {

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            setBalance(getBalance() - amount);

            // Logging
            System.out.println("Success in withdraw. Amount:  " + amount + ", SSN: " + ssn);
        } catch (SsnNotValidException | NegativeAmountException e) {
            System.err.println("Error: " + e.getMessage() + ", " + LocalDateTime.now());
            throw e;
        }
    }

    @Override
    protected boolean isSSnValid(String ssn) {
        return false;
    }
}