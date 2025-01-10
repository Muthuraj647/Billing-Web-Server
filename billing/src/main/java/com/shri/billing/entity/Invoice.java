package com.shri.billing.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String invoiceNumber;
    private LocalDate invoiceDate;
    private Double totalAmount;

    @ManyToOne
    private Customer customer;

}

