package com.shri.billing.dto;

import com.shri.billing.lookup.Brand;

public class ModelDto {
    private Long id;
    private String itemId;
    private String brandId;
    private String brandName;
    private String label;
    private Long basePercentage;

    public ModelDto(Long id, String itemId, String brandId, String brandName, String label, Long basePercentage) {
        this.id = id;
        this.itemId = itemId;
        this.brandId = brandId;
        this.brandName = brandName;
        this.label = label;
        this.basePercentage = basePercentage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Long getBasePercentage() {
        return basePercentage;
    }

    public void setBasePercentage(Long basePercentage) {
        this.basePercentage = basePercentage;
    }
}