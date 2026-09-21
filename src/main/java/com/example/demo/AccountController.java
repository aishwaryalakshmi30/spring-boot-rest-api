package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // POST - Add Account
    @PostMapping
    public Account addAccount(@RequestBody Account account) {
        return accountService.addAccount(account);
    }

    // GET - Get All Accounts
    @GetMapping
    public List<Account> getAccounts() {
        return accountService.getAccounts();
    }

    // PUT - Update Account
    @PutMapping("/{holderName}")
    public Account updateAccount(
            @PathVariable String holderName,
            @RequestBody Account updatedAccount) {

        return accountService.updateAccount(holderName, updatedAccount);
    }

    // DELETE - Delete Account
    @DeleteMapping("/{holderName}")
    public String deleteAccount(@PathVariable String holderName) {

        return accountService.deleteAccount(holderName);
    }
}