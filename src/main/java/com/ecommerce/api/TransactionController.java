package com.ecommerce.api;

import com.ecommerce.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/order")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

//    @PostMapping
//    public ResponseEntity checkout(@Valid @RequestBody final Transaction transaction) {
//        this.transactionService.checkout(transaction);
//
//    }

}
