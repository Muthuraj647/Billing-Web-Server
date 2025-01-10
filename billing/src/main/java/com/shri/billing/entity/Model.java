package com.shri.billing.entity;

import com.shri.billing.lookup.Brand;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

@Entity
@Data
@Proxy(lazy = false)
public class Model {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long basePercentage;
    @JoinColumn(name = "brand_id",referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Brand brand;
    private String name;
    private String itemId;
    private String model;
    private String spec;
    private String label;

    public Model(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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

    public Model(Long id, String name, String itemId, Brand brand, String model, String spec, String label, Long basePercentage) {
        this.id = id;
        this.name = name;
        this.itemId = itemId;
        this.brand = brand;
        this.model = model;
        this.spec = spec;
        this.label = label;
        this.basePercentage = basePercentage;
    }

    public Model() {
    }
}
