package com.shri.billing.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shri.billing.lookup.Category;
import com.shri.billing.lookup.Grade;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Purchase {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderDate;

    @JoinColumn(name = "category_id" ,referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @JoinColumn(name = "model_id" ,referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Model model;

    @JoinColumn(name = "grade_id" ,referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Grade grade;

    private String imei;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date costDebitDate;
    private Long costAmount;
    private Long deliveryFee;
    private Long exchangeFee;
    private String trackingId;
}
