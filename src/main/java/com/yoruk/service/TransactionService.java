package com.yoruk.service;

import com.yoruk.model.Account;
import com.yoruk.model.Transaction;
import com.yoruk.service.imp1.BadRequestException;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface TransactionService {
    Transaction makeTransfer(Account sender, Account receiver, BigDecimal amount, Date creationDate, String message) throws BadRequestException;

    List<Transaction> findAllTransaction();

    Transaction makeTransfer(Account sender, Account receiver, BigDecimal amount);
}
