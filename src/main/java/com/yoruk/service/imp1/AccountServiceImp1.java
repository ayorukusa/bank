package com.yoruk.service.imp1;

import com.yoruk.enums.AccountType;
import com.yoruk.model.Account;
import com.yoruk.repository.accountRepository;
import com.yoruk.service.AccountService;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AccountServiceImp1 implements AccountService {

    @Override
    public Account createNewAccount(BigDecimal balance, Date creationDate, AccountType accountType, Long userId) {
        //we need to create Account object
        Account account = Account.builder().id(UUID.randomUUID())
                .userId(userId).balance(balance).accountType(accountType).creationDate(creationDate).build();
        //save into the database(repository)
        //return the object created

        return accountRepository.save(account);


    }


    @Override
    public List<Account> listAllAccount() {
        return accountRepository.findAll();
    }

}
