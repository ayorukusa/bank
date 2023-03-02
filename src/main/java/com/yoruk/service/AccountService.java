package com.yoruk.service;

import com.yoruk.enums.AccountType;
import com.yoruk.model.Account;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface AccountService {
    Account createNewAccount(BigDecimal balance,Date creationDate, AccountType accountType,Long userId);
    List<Account> listAllAccount();

}
