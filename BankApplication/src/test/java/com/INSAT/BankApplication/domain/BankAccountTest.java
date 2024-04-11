package com.INSAT.BankApplication.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    @Test
    void should_deposit() {
        //given
        BankAccount bankAccount= new BankAccount(500);
        //when
        bankAccount.deposit(500);
        //then
        Assertions.assertThat(bankAccount.getBalance()).isEqualTo(1000);
    }
}