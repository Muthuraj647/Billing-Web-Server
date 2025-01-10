package com.shri.billing.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Purchase> purchases;

    @OneToOne(cascade = CascadeType.ALL)
    private Invoice invoice;

    private Double totalAmount;
}

