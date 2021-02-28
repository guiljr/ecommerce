package com.ecommerce.service;

import com.ecommerce.model.Transaction;

public interface TransactionService {


    Transaction checkout(Transaction transaction);

    Transaction findById(Long id);
}
