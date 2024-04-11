package com.INSAT.BankApplication.Controller;

import com.INSAT.BankApplication.Service.BankAccountService;
import com.INSAT.BankApplication.domain.BankAccount;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bankAccount")
public class BankAccountController {
    private BankAccountService bankAccountService;

    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }
    @PostMapping("/{amount}")
    public BankAccount create(@PathVariable  double amount){
        return bankAccountService.create(amount);
    }
    @PutMapping("/{id}/deposit/{amount}")
    public BankAccount depositBankAccount(@PathVariable long id, @PathVariable double amount){
        return bankAccountService.deposit(id,amount);
    }
}
