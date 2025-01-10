package com.shri.billing.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shri.billing.lookup.Category;
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

//    @JoinColumn(name = "grade_id" ,referencedColumnName = "id")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Grade grade;

    private String gradeId;

    private String imei;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date costDebitDate;
    private Float costAmount;
    private Float deliveryFee;
    private Float exchangeFee;
    private String trackingId;
    private Float purchaseAmount;
    private Float soldAmount;

    public Purchase(){}
    public Purchase(Long id, String orderId, Date orderDate, Category category, Model model, String gradeId, String imei, Date costDebitDate, Float costAmount, Float deliveryFee, Float exchangeFee, String trackingId, Float purchaseAmount,Float soldAmount) {
        this.id = id;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.category = category;
        this.model = model;
        this.gradeId = gradeId;
        this.imei = imei;
        this.costDebitDate = costDebitDate;
        this.costAmount = costAmount;
        this.deliveryFee = deliveryFee;
        this.exchangeFee = exchangeFee;
        this.trackingId = trackingId;
        this.purchaseAmount = purchaseAmount;
        this.soldAmount =soldAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public Date getCostDebitDate() {
        return costDebitDate;
    }

    public void setCostDebitDate(Date costDebitDate) {
        this.costDebitDate = costDebitDate;
    }

    public Float getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(Float costAmount) {
        this.costAmount = costAmount;
    }

    public Float getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Float deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Float getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(Float exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public Float getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Float purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
