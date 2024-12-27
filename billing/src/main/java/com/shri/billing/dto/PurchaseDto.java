package com.shri.billing.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
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

    private String categoryValue;
    private String modelName;
    private String modelLabel;
    private String itemValue;
    private String gradeValue;

    public PurchaseDto(Long id, String orderId, Date orderDate, String categoryId, Long modelId, String gradeId,
                       String imei, String trackingId, String categoryValue, String modelName,
                       String modelLabel, String itemValue, String gradeValue) {
        this.id = id;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.categoryId = categoryId;
        this.modelId = modelId;
        this.gradeId = gradeId;
        this.imei = imei;
//        this.costDebitDate = costDebitDate;
//        this.costAmount = costAmount;
//        this.deliveryFee = deliveryFee;
//        this.exchangeFee = exchangeFee;
        this.trackingId = trackingId;
        this.categoryValue = categoryValue;
        this.modelName = modelName;
        this.modelLabel = modelLabel;
        this.itemValue = itemValue;
        this.gradeValue = gradeValue;
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

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
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

    public Long getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(Long costAmount) {
        this.costAmount = costAmount;
    }

    public Long getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Long deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Long getExchangeFee() {
        return exchangeFee;
    }

    public void setExchangeFee(Long exchangeFee) {
        this.exchangeFee = exchangeFee;
    }

    public String getTrackingId() {
        return trackingId;
    }

    public void setTrackingId(String trackingId) {
        this.trackingId = trackingId;
    }

    public String getCategoryValue() {
        return categoryValue;
    }

    public void setCategoryValue(String categoryValue) {
        this.categoryValue = categoryValue;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelLabel() {
        return modelLabel;
    }

    public void setModelLabel(String modelLabel) {
        this.modelLabel = modelLabel;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }

    public String getGradeValue() {
        return gradeValue;
    }

    public void setGradeValue(String gradeValue) {
        this.gradeValue = gradeValue;
    }
}
