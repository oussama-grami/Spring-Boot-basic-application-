package com.INSAT.BankApplication.Service;

import com.INSAT.BankApplication.domain.BankAccount;
import com.INSAT.BankApplication.respository.BankAccountRepository;
import org.springframework.stereotype.Service;

@Service
public class BankAccountService {
    private final BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }
    public BankAccount loadBankAccount(long id){
        return bankAccountRepository.findById(id).orElse(null);
    }

    public BankAccount create(double amount){
        BankAccount bankAccount = new BankAccount(amount);
        return bankAccountRepository.save(bankAccount);
    }
    public BankAccount deposit(long id,double amount){
        BankAccount bankAccount  =loadBankAccount(id);
        bankAccount.deposit(amount);
        return bankAccountRepository.save(bankAccount);
    }
}
