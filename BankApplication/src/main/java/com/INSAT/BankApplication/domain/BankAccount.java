package com.INSAT.BankApplication.domain;

import jakarta.persistence.*;

@Entity
@Table(name="BankAccount")
public class BankAccount {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;
    @Column(name="balance")
    private double balance;

    public BankAccount() {}

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
