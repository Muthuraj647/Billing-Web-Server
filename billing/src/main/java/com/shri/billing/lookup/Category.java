package com.shri.billing.lookup;

import com.shri.billing.entity.LookUp;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Category")
public class Category extends LookUp {
    public Category(String id) {
        super(id);
    }
}
