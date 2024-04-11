package com.INSAT.BankApplication.respository;

import com.INSAT.BankApplication.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BankAccountRepository extends JpaRepository<BankAccount,Long > {

}
