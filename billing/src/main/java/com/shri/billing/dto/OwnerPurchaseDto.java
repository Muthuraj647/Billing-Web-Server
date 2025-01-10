package com.shri.billing.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class OwnerPurchaseDto {
    @JsonIgnore
    private Long id;
    private String trackingNumber;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date orderedDate;
    private String grade;
    private String IMEI;
    private Float purchaseAmount;
    private String categoryValue;
    private String model;

    public OwnerPurchaseDto(Long id,String trackingId, Date orderDate, String gradeId,
                            String imei, Float purchaseAmount, String categoryValue,
                            String modelLabel) {
        this.id = id;
        this.trackingNumber = trackingId;
        this.orderedDate = orderDate;
        this.grade = gradeId;
        this.IMEI = imei;
        this.purchaseAmount=purchaseAmount;
        this.categoryValue = categoryValue;
        this.model = modelLabel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Date getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(Date orderedDate) {
        this.orderedDate = orderedDate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getImei() {
        return IMEI;
    }

    public void setImei(String imei) {
        this.IMEI = imei;
    }

    public Float getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(Float purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getCategoryValue() {
        return categoryValue;
    }

    public void setCategoryValue(String categoryValue) {
        this.categoryValue = categoryValue;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public OwnerPurchaseDto() {
    }
}
