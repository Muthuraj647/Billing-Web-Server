package com.shri.billing.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @JsonIgnore
    private Long purchaseAmount;

    public Long getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Long purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Long getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(Long exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public Long getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Long deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Long getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(Long costAmount) {
        this.costAmount = costAmount;
    }

    public Date getCostDebitDate() {
        return costDebitDate;
    }

    public void setCostDebitDate(Date costDebitDate) {
        this.costDebitDate = costDebitDate;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
