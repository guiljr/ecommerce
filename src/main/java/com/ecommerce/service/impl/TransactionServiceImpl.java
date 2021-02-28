package com.ecommerce.service.impl;

import com.ecommerce.exception.ResourceNotFoundException;
import com.ecommerce.model.Transaction;
import com.ecommerce.repository.TransactionRepository;
import com.ecommerce.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public Transaction checkout(Transaction transaction) {
        return this.transactionRepository.save(transaction);
    }

    @Override
    public Transaction findById(Long id) throws ResourceNotFoundException {
        return this.transactionRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Transaction", "id", id));
    }
}
