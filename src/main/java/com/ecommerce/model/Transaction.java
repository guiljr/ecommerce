package com.ecommerce.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="txn_date")
    private Date txnDate;
    @Column(nullable = false)
    private BigDecimal txnPrice;


}
