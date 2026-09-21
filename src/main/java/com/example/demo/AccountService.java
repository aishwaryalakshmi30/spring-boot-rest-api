package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {

    private List<Account> accounts = new ArrayList<>();

    // POST - Add Account
    public Account addAccount(Account account) {
        accounts.add(account);
        return account;
    }

    // GET - Get All Accounts
    public List<Account> getAccounts() {
        return accounts;
    }

    // PUT - Update Account
    public Account updateAccount(String holderName, Account updatedAccount) {

        for (Account account : accounts) {

            if (account.getHolderName().equals(holderName)) {

                account.setHolderName(updatedAccount.getHolderName());
                account.setBalance(updatedAccount.getBalance());

                return account;
            }
        }

        return null;
    }

    // DELETE - Delete Account
    public String deleteAccount(String holderName) {

        boolean removed = accounts.removeIf(
                account -> account.getHolderName().equals(holderName)
        );

        if (removed) {
            return "Account deleted successfully";
        }

        return "Account not found";
    }
}