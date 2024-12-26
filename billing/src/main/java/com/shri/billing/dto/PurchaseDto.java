package com.shri.billing.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shri.billing.entity.Model;
import com.shri.billing.lookup.Category;
import com.shri.billing.lookup.Grade;
import jakarta.persistence.*;

import java.util.Date;

public class PurchaseDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String orderId;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderDate;
    private String categoryId;
    private Long modelId;
    private String gradeId;
    private String imei;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date costDebitDate;
    private Long costAmount;
    private Long deliveryFee;
    private Long exchangeFee;
    private String trackingId;
}
